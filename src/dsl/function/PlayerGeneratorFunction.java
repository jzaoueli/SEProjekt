package dsl.function;

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
        if (isNull(initPlayer(src))) {
            return false;
        }

        String className = "ImagePlayer";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader(null, null);

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
        String fileName;
        int numberLine, numberColumn, width, height;
        if (isNull(ctx.images().player().spriteObject().imageObject().fileName().exception)) {
            fileName = ctx.images().player().spriteObject().imageObject().fileName().getText();
        } else {
            System.out.println("please verify filename of player:");
            System.out.println("        Ex: file:[filename].[extension]");
            player = null;
            return;
        }
        if (isNull(ctx.images().player().spriteObject().numberLine().value().exception)) {
            numberLine = valueOf(ctx.images().player().spriteObject().numberLine().value().getText());
        } else {
            System.out.println("please verify numberLine 'row' of player");
            System.out.println("        Ex: row:[int]");
            player = null;
            return;
        }
        if (isNull(ctx.images().player().spriteObject().numberColumn().value().exception)) {
            numberColumn = valueOf(ctx.images().player().spriteObject().numberColumn().value().getText());
        } else {
            System.out.println("please verify numberColumn 'column' of player");
            System.out.println("        Ex: column:[int]");
            player = null;
            return;
        }
        if (isNull(ctx.images().player().spriteObject().width().value().exception)) {
            width = valueOf(ctx.images().player().spriteObject().width().value().getText());
        } else {
            System.out.println("please verify width of player");
            System.out.println("        Ex: width:[int]");
            player = null;
            return;
        }
        if (isNull(ctx.images().player().spriteObject().height().value().exception)) {
            height = valueOf(ctx.images().player().spriteObject().height().value().getText());
        } else {
            System.out.println("please verify value of player height:");
            System.out.println("        Ex: height:[int]");
            player = null;
            return;
        }
        player = new Player(fileName, numberLine, numberColumn, width, height);
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
