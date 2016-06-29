package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import main.generated.Player;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.CodeGeneratorFunction.getConstructor;
import static dsl.CodeGeneratorFunction.getGetter;
import static java.lang.Integer.valueOf;

/**
 * player class generation
 */
public class PlayerGeneratorFunction extends GramBaseListener{
    private static Player player;
    private String content = "";

    public void run(String packageName) throws IOException {
        initPlayer();
        String className = "Player";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader("");

        setPlayerContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    private static Player initPlayer() throws IOException {
        FileReader fileReader = new FileReader("src/dsl/antlr/src.csv");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileReader);
        // Get CSV lexer
        GramLexer lexer = new GramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        GramParser parser = new GramParser(tokens);
        // Specify our entry point
        GramParser.FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        GramBaseListener listener = new PlayerGeneratorFunction();
        walker.walk(listener, fileContext);
        return player;
    }
    public void exitFile(GramParser.FileContext ctx) {
        String fileName = ctx.player().fileName().getText();
        int numberLine = valueOf(ctx.player().nubmerLine().getText());
        int numberColumn = valueOf(ctx.player().numberColumn().getText());
        int width = valueOf(ctx.player().objectWidth().getText());
        int height = valueOf(ctx.player().objectHeight().getText());

        player = new Player(fileName, numberLine, numberColumn, width, height);
    }

    private void setPlayerContent() {
        content += getPlayerMemberVariable();
        content += getConstructor("Player");
        content += getPlayerConstructorWithParameters();
        content += getPlayerMethods();
    }

    private String getPlayerConstructorWithParameters() {
        return "    /**\n" +
                "     * Constructor with parameters\n" +
                "     */\n" +
                "    public Player(String fileName, int numberLine, int numberColumn, int width, int height) {\n" +
                "        this.fileName = fileName;\n" +
                "        this.numberLine = numberLine;\n" +
                "        this.numberColumn = numberColumn;\n" +
                "        this.width = width;\n" +
                "        this.height = height;\n" +
                "    }\n\n";
    }

    private String getPlayerMethods() {
        String tempString = "";
        tempString += getGetter("FileName", "fileName", "String");
        tempString += getGetter("NumberLine", "numberLine", "int");
        tempString += getGetter("NumberColumn", "numberColumn", "int");
        tempString += getGetter("Width", "width", "int");
        tempString += getGetter("Height", "height", "int");

        return tempString;
    }

    private String getPlayerMemberVariable() {
        return "    private String fileName = \""+ player.getFileName()+"\";\n" +
                "    private int numberLine = "+ player.getNumberLine()+";\n" +
                "    private int numberColumn = "+player.getNumberColumn()+";\n" +
                "    private int width = "+player.getWidth()+";\n" +
                "    private int height = "+ player.getHeight()+";\n\n";
    }
}
