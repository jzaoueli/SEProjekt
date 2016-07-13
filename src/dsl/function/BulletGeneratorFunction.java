package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import dsl.antlr.model.Bullet;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.valueOf;

/**
 * Bullet class generation
 */
public class BulletGeneratorFunction extends MyGramBaseListener {
    private static Bullet bullet;
    private String packageName;

    private String content = "";
    private boolean noError = true;

    public BulletGeneratorFunction(String packageName) {
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
        MyGramBaseListener listener = new BulletGeneratorFunction(packageName);
        walker.walk(listener, fileContext);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        noError = false;
    }

    @Override
    public void exitBullet(MyGramParser.BulletContext ctx) {
        String fileName;
        int numberLine, numberColumn, width, height, attack, speed;
        if (noError) {
            fileName = ctx.spriteObject().imageObject().fileName().getText();
            numberLine = valueOf(ctx.spriteObject().numberLine().value().getText());
            numberColumn = valueOf(ctx.spriteObject().numberColumn().value().getText());
            width = valueOf(ctx.spriteObject().width().value().getText());
            height = valueOf(ctx.spriteObject().height().value().getText());
            attack = valueOf(ctx.attack().value().getText());
            speed = valueOf(ctx.speed().value().getText());
        } else {
            noError = true;
            return;
        }
        bullet = new Bullet(fileName, numberLine, numberColumn, width, height, attack, speed);
        try {
            generateBullet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void setBulletContent() {
        content += getBulletMemberVariable();
        content += getBulletMethods();
    }

    private String getBulletMethods() {
        return "    public Object[] getBulletImage(){\n" +
                "        return new Object[]{fileName, numberLine, numberColumn, width, height, attack, speed};\n" +
                "    }";
    }

    private String getBulletMemberVariable() {
        return "    private String fileName = \"" + bullet.getFileName() + "\";\n" +
                "    private int numberLine = " + bullet.getNumberLine() + ";\n" +
                "    private int numberColumn = " + bullet.getNumberColumn() + ";\n" +
                "    private int width = " + bullet.getWidth() + ";\n" +
                "    private int height = " + bullet.getHeight() + ";\n" +
                "    private int attack = " + bullet.getAttack() + ";\n" +
                "    private int speed = " + bullet.getSpeed() + ";\n\n";
    }

    private void generateBullet() throws IOException {
        String className = "BulletNormal";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        String importClass = "import main.model.Bullet;";
        String extendsClass = "extends Bullet";
        codeGeneratorFunction.setHeader(importClass, extendsClass);

        setBulletContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        System.out.println("- " + "Bullet" + " is generated");
        content = "";
    }
}
