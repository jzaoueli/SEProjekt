package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import dsl.antlr.model.Player;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.CodeGeneratorFunction.getConstructor;
import static dsl.CodeGeneratorFunction.getGetter;
import static java.lang.Integer.valueOf;
import static java.util.Objects.isNull;

/**
 * player class generation
 */
public class PlayerGeneratorFunction extends GramBaseListener {
    private static Player player;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        initPlayer(src);
        String className = "ImagePlayer";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        if (isNull(player)) {
            return false;
        }
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

        if (isNull(ctx.player().fileName().exception) &&
                isNull(ctx.player().nubmerLine().exception) &&
                isNull(ctx.player().numberColumn().exception) &&
                isNull(ctx.player().objectWidth().exception) &&
                isNull(ctx.player().objectHeight().exception)) {

            String fileName = ctx.player().fileName().getText();
            int numberLine = valueOf(ctx.player().nubmerLine().getText());
            int numberColumn = valueOf(ctx.player().numberColumn().getText());
            int width = valueOf(ctx.player().objectWidth().getText());
            int height = valueOf(ctx.player().objectHeight().getText());

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
