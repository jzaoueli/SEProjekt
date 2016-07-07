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
        String className = "BulletNormal";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        if (isNull(bullet)) {
            return false;
        }
        codeGeneratorFunction.setHeader("import main.model.Bullet;");

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
        content += getBulletMethods();
    }

    private String getBulletMethods() {
        return "    public Object[] getBulletImage(){\n" +
                "        return new Object[]{fileName, numberLine, numberColumn, width, height, attack};\n" +
                "    }";
    }

    private String getBulletMemberVariable() {
        return "    private String fileName = \"" + bullet.getFileName() + "\";\n" +
                "    private int numberLine = " + bullet.getNumberLine() + ";\n" +
                "    private int numberColumn = " + bullet.getNumberColumn() + ";\n" +
                "    private int width = " + bullet.getWidth() + ";\n" +
                "    private int height = " + bullet.getHeight() + ";\n" +
                "    private int attack = 1;\n\n";
    }
}
