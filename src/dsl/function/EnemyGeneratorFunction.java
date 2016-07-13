package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.model.Enemy;
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
 * Enemy class generation.
 */
public class EnemyGeneratorFunction extends MyGramBaseListener {

    private Enemy enemy;
    private String packageName;

    private String content = "";
    private boolean noError = true;

    public EnemyGeneratorFunction(String packageName) {
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
        MyGramBaseListener listener = new EnemyGeneratorFunction(packageName);
        walker.walk(listener, fileContext);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        noError = false;
    }

    public void exitEnemy(MyGramParser.EnemyContext ctx) {
        String enemyName, fileName, movingType;
        int numberLine, numberColumn, width, height, attack, defence, speed;

        if (noError) {
            enemyName = ctx.className().getText();
            fileName = ctx.spriteObject().imageObject().fileName().getText();
            numberLine = valueOf(ctx.spriteObject().numberLine().value().getText());
            numberColumn = valueOf(ctx.spriteObject().numberColumn().value().getText());
            width = valueOf(ctx.spriteObject().width().value().getText());
            height = valueOf(ctx.spriteObject().height().value().getText());
            movingType = ctx.movement().movingType().getText();
            attack = valueOf(ctx.attack().value().getText());
            defence = valueOf(ctx.defense().value().getText());
            speed = valueOf(ctx.speed().value().getText());
        } else {
            noError = true;
            return;
        }
        enemy = new Enemy(enemyName, fileName, numberLine, numberColumn, width, height, movingType, speed, attack, defence);
        try {
            generateEnemy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateEnemy() throws IOException {
        String className = enemy.getEnemyName() + "Data";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        String importClass = "import main.model.Enemy;";
        String extendsClass = "extends Enemy";
        codeGeneratorFunction.setHeader(importClass, extendsClass);

        setEnemyContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        System.out.println("- " + enemy.getEnemyName() + " is generated");
        content = "";
    }


    private void setEnemyContent() {
        content += getEnemyMemberVariable();
        content += getEnemyMethods();
    }

    private String getEnemyMethods() {
        return "    public Object[] get" + enemy.getEnemyName() + "Data() {\n" +
                "        return new Object[]{fileName, numberLine, numberColumn, width, height,\n" +
                "                movingType, speed, offense, defence};\n" +
                "    }\n";
    }

    private String getEnemyMemberVariable() {
        return "    private String fileName = \"" + enemy.getFileName() + "\";\n" +
                "    private int numberLine = " + enemy.getNumberLine() + ";\n" +
                "    private int numberColumn = " + enemy.getNumberColumn() + ";\n" +
                "    private int width = " + enemy.getWidth() + ";\n" +
                "    private int height = " + enemy.getHeight() + ";\n" +
                "    private String movingType = \"" + enemy.getMovingType() + "\";\n" +
                "    private int speed = " + enemy.getSpeed() + ";\n" +
                "    private int offense = " + enemy.getOffense() + ";\n" +
                "    private int defence = " + enemy.getDefence() + ";\n\n";
    }
}
