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
        //TODO : check exception and get value single
        if (isNull(ctx.bullet().spriteObject().imageObject().fileName().exception) &&
                isNull(ctx.bullet().spriteObject().numberLine().value().exception) &&
                isNull(ctx.bullet().spriteObject().numberColumn().value().exception) &&
                isNull(ctx.bullet().spriteObject().width().value().exception) &&
                isNull(ctx.bullet().spriteObject().height().value().exception) &&
                isNull(ctx.bullet().attack().value().exception) &&
                isNull(ctx.bullet().speed().value().exception)
                ) {

            String fileName = ctx.bullet().spriteObject().imageObject().fileName().getText();
            int numberLine = valueOf(ctx.bullet().spriteObject().numberLine().value().getText());
            int numberColumn = valueOf(ctx.bullet().spriteObject().numberColumn().value().getText());
            int width = valueOf(ctx.bullet().spriteObject().width().value().getText());
            int height = valueOf(ctx.bullet().spriteObject().height().value().getText());
            int attack = valueOf(ctx.bullet().attack().value().getText());
            int speed = valueOf(ctx.bullet().speed().value().getText());

            bullet = new Bullet(fileName, numberLine, numberColumn, width, height, attack, speed);
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
