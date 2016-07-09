package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import dsl.antlr.model.Bullet;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.valueOf;
import static java.util.Objects.isNull;

/**
 * Bullet class generation
 */
public class BulletGeneratorFunction extends MyGramBaseListener {
    private static Bullet bullet;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        if (isNull(initBullet(src))) {
            return false;
        }

        String className = "BulletNormal";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader("import main.model.Bullet;", "extends Bullet");

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
        MyGramLexer lexer = new MyGramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        MyGramParser parser = new MyGramParser(tokens);
        // Specify our entry point
        MyGramParser.GramContext fileContext = parser.gram();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGramBaseListener listener = new BulletGeneratorFunction();
        walker.walk(listener, fileContext);
        return bullet;
    }

    public void exitGram(MyGramParser.GramContext ctx) {
        String fileName;
        int numberLine, numberColumn, width, height, attack, speed;
        if (isNull(ctx.bullet().spriteObject().imageObject().fileName().exception)) {
            fileName = ctx.bullet().spriteObject().imageObject().fileName().getText();
        } else {
            System.err.println("please verify filename of bullet:");
            System.err.println("        Ex: file:[filename].[extension]");
            bullet = null;
            return;
        }
        if (isNull(ctx.bullet().spriteObject().numberLine().value().exception)) {
            numberLine = valueOf(ctx.bullet().spriteObject().numberLine().value().getText());
        } else {
            System.err.println("please verify numberLine 'row' of bullet:");
            System.out.println("        Ex: row:[int]");
            bullet = null;
            return;
        }
        if (isNull(ctx.bullet().spriteObject().numberColumn().value().exception)) {
            numberColumn = valueOf(ctx.bullet().spriteObject().numberColumn().value().getText());
        } else {
            System.err.println("please verify numberColumn 'column' of bullet:");
            System.out.println("        Ex: column:[int]");
            bullet = null;
            return;
        }
        if (isNull(ctx.bullet().spriteObject().width().value().exception)) {
            width = valueOf(ctx.bullet().spriteObject().width().value().getText());
        } else {
            System.err.println("please verify width of bullet:");
            System.out.println("        Ex: width:[int]");
            bullet = null;
            return;
        }
        if (isNull(ctx.bullet().spriteObject().height().value().exception)) {
            height = valueOf(ctx.bullet().spriteObject().height().value().getText());
        } else {
            System.err.println("please verify value of bullet height:");
            System.out.println("        Ex: height:[int]");
            bullet = null;
            return;
        }
        if (isNull(ctx.bullet().attack().value().exception)) {
            attack = valueOf(ctx.bullet().attack().value().getText());
        } else {
            System.err.println("please verify value of ballet attack:");
            System.out.println("        Ex: attack:[int]");
            bullet = null;
            return;
        }
        if (isNull(ctx.bullet().speed().value().exception)) {
            speed = valueOf(ctx.bullet().speed().value().getText());
        } else {
            System.err.println("please verify value of ballet speed:");
            System.out.println("        Ex: speed:[int]");
            bullet = null;
            return;
        }
        bullet = new Bullet(fileName, numberLine, numberColumn, width, height, attack, speed);
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
