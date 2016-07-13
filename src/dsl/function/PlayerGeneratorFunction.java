package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.model.Player;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.valueOf;

/**
 * player class generation
 */
public class PlayerGeneratorFunction extends MyGramBaseListener {
    private static Player player;
    private String packageName;

    private String content = "";
    private boolean noError = true;

    public PlayerGeneratorFunction(String packageName) {
        this.packageName = packageName;
    }

    public void run(String src) throws IOException {
        FileReader fileReader = new FileReader(src);
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileReader);
        // Get CSV lexer
        MyGramLexer lexer = new MyGramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        MyGramParser parser = new MyGramParser(tokens);
        // Specify our entry point
        MyGramParser.GramContext fileContext = parser.gram();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGramBaseListener listener = new PlayerGeneratorFunction(packageName);
        walker.walk(listener, fileContext);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        noError = false;
    }

    @Override
    public void exitPlayer(MyGramParser.PlayerContext ctx) {
        String fileName;
        int numberLine, numberColumn, width, height;
        if (noError) {
            fileName = ctx.spriteObject().imageObject().fileName().getText();
            numberLine = valueOf(ctx.spriteObject().numberLine().value().getText());
            numberColumn = valueOf(ctx.spriteObject().numberColumn().value().getText());
            width = valueOf(ctx.spriteObject().width().value().getText());
            height = valueOf(ctx.spriteObject().height().value().getText());
        } else {
            noError = true;
            return;
        }
        player = new Player(fileName, numberLine, numberColumn, width, height);
        try {
            generatePlayer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void setPlayerContent() {
        content += getPlayerMemberVariable();
        content += getPlayerMethods();
    }

    private String getPlayerMethods() {
        return "    public Object[] getPlayerImage() {\n" +
                "        return new Object[]{fileName, numberLine, numberColumn, width, height};\n" +
                "    }";
    }

    private String getPlayerMemberVariable() {
        return "    private String fileName = \"" + player.getFileName() + "\";\n" +
                "    private int numberLine = " + player.getNumberLine() + ";\n" +
                "    private int numberColumn = " + player.getNumberColumn() + ";\n" +
                "    private int width = " + player.getWidth() + ";\n" +
                "    private int height = " + player.getHeight() + ";\n\n";
    }

    private void generatePlayer() throws IOException {
        String className = "ImagePlayer";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader(null, null);

        setPlayerContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        System.out.println("- " + "Player" + " is generated");
        content = "";
    }
}
