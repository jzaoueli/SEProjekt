package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.model.Player;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.valueOf;
import static java.util.Objects.isNull;

/**
 * player class generation
 */
public class PlayerGeneratorFunction extends MyGramBaseListener {
    private static Player player;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        initPlayer(src);

        if (isNull(player)) {
            return false;
        }

        String className = "ImagePlayer";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader("");

        setPlayerContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

        return true;
    }

    private static Player initPlayer(String src) throws IOException {
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
        MyGramBaseListener listener = new PlayerGeneratorFunction();
        walker.walk(listener, fileContext);
        return player;
    }

    public void exitGram(MyGramParser.GramContext ctx) {

        if (isNull(ctx.images().player().spriteObject().imageObject().fileName().exception) &&
                isNull(ctx.images().player().spriteObject().numberLine().exception) &&
                isNull(ctx.images().player().spriteObject().numberColumn().exception) &&
                isNull(ctx.images().player().spriteObject().width().exception) &&
                isNull(ctx.images().player().spriteObject().height().exception)) {

            String fileName = ctx.images().player().spriteObject().imageObject().fileName().getText();
            int numberLine = valueOf(ctx.images().player().spriteObject().numberLine().value().getText());
            int numberColumn = valueOf(ctx.images().player().spriteObject().numberColumn().value().getText());
            int width = valueOf(ctx.images().player().spriteObject().width().value().getText());
            int height = valueOf(ctx.images().player().spriteObject().height().value().getText());

            player = new Player(fileName, numberLine, numberColumn, width, height);
        } else {
            player = null;
        }
    }

    private void setPlayerContent() {
        content += getPlayerMemberVariable();
        content += getPlayerMethods();
    }

    private String getPlayerMethods() {
        String tempString = "";
        tempString += getGetPlayerImage();

        return tempString;
    }

    private String getGetPlayerImage() {
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
}
