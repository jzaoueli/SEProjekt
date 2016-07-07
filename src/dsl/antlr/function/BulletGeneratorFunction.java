package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import dsl.antlr.model.Bullet;
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
 * Bullet class generation
 */
public class BulletGeneratorFunction extends GramBaseListener {
    private static Bullet bullet;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        initBullet(src);
        String className = "Bullet";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        if (isNull(bullet)) {
            return false;
        }
        codeGeneratorFunction.setHeader("");

        setPlayerContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

        return true;
    }

    private static Bullet initBullet(String src) throws IOException {
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
        GramBaseListener listener = new BulletGeneratorFunction();
        walker.walk(listener, fileContext);
        return bullet;
    }

    public void exitFile(GramParser.FileContext ctx) {
        if (isNull(ctx.bullet().fileName().exception) &&
                isNull(ctx.bullet().nubmerLine().exception) &&
                isNull(ctx.bullet().numberColumn().exception) &&
                isNull(ctx.bullet().objectWidth().exception) &&
                isNull(ctx.bullet().objectHeight().exception)) {

            String fileName = ctx.bullet().fileName().getText();
            int numberLine = valueOf(ctx.bullet().nubmerLine().getText());
            int numberColumn = valueOf(ctx.bullet().numberColumn().getText());
            int width = valueOf(ctx.bullet().objectWidth().getText());
            int height = valueOf(ctx.bullet().objectHeight().getText());

            bullet = new Bullet(fileName, numberLine, numberColumn, width, height);
        } else {
            bullet = null;
        }


    }

    private void setPlayerContent() {
        content += getBulletMemberVariable();
        content += getConstructor("Bullet");
        content += getBulletConstructorWithParameters();
        content += getBulletMethods();
    }

    private String getBulletConstructorWithParameters() {
        return "    /**\n" +
                "     * Constructor with parameters\n" +
                "     */\n" +
                "      public Bullet(String fileName, int numberLine, int numberColumn, int width, int height) {\n" +
                "        this.fileName = fileName;\n" +
                "        this.numberLine = numberLine;\n" +
                "        this.numberColumn = numberColumn;\n" +
                "        this.width = width;\n" +
                "        this.height = height;\n" +
                "    }\n\n";
    }

    private String getBulletMethods() {
        String tempString = "";
        tempString += getGetter("FileName", "fileName", "String");
        tempString += getGetter("NumberLine", "numberLine", "int");
        tempString += getGetter("NumberColumn", "numberColumn", "int");
        tempString += getGetter("Width", "width", "int");
        tempString += getGetter("Height", "height", "int");

        return tempString;
    }

    private String getBulletMemberVariable() {
        return "    private String fileName = \"" + bullet.getFileName() + "\";\n" +
                "    private int numberLine = " + bullet.getNumberLine() + ";\n" +
                "    private int numberColumn = " + bullet.getNumberColumn() + ";\n" +
                "    private int width = " + bullet.getWidth() + ";\n" +
                "    private int height = " + bullet.getHeight() + ";\n\n";
    }
}