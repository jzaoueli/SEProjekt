package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import main.generated.Enemy;
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
 * Enemy class generation.
 */
public class EnemyGeneratorFunction extends GramBaseListener {
    private static Enemy enemy;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        initEnemy(src);
        String className = "Enemy";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        if (isNull(enemy)) {
            return false;
        }
        codeGeneratorFunction.setHeader("");

        setEnemyContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

        return true;
    }

    private static Enemy initEnemy(String src) throws IOException {
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
        GramBaseListener listener = new EnemyGeneratorFunction();
        walker.walk(listener, fileContext);
        return enemy;
    }

    public void exitFile(GramParser.FileContext ctx) {
        if (isNull(ctx.enemy().fileName().exception) &&
                isNull(ctx.enemy().nubmerLine().exception) &&
                isNull(ctx.enemy().numberColumn().exception) &&
                isNull(ctx.enemy().objectWidth().exception) &&
                isNull(ctx.enemy().objectHeight().exception) &&
                isNull(ctx.enemy().movingType().exception) &&
                isNull(ctx.enemy().speed().exception) &&
                isNull(ctx.enemy().offense().exception) &&
                isNull(ctx.enemy().defence().exception) &&
                isNull(ctx.enemy().probability().exception)) {

            String fileName = ctx.enemy().fileName().getText();
            int numberLine = valueOf(ctx.enemy().nubmerLine().getText());
            int numberColumn = valueOf(ctx.enemy().numberColumn().getText());
            int width = valueOf(ctx.enemy().objectWidth().getText());
            int height = valueOf(ctx.enemy().objectHeight().getText());
            String movingType = ctx.enemy().movingType().getText();
            int speed = valueOf(ctx.enemy().speed().getText());
            int offense = valueOf(ctx.enemy().offense().getText());
            int defence = valueOf(ctx.enemy().defence().getText());
            int probability = valueOf(ctx.enemy().probability().getText());

            enemy = new Enemy(fileName, numberLine, numberColumn, width, height, movingType, speed, offense, defence, probability);
        } else {
            enemy = null;
        }

    }

    private void setEnemyContent() {
        content += getEnemyMemberVariable();
        content += getConstructor("Enemy");
        content += getEnemyConstructorWithParameters();
        content += getEnemyMethods();
    }

    private String getEnemyConstructorWithParameters() {
        return "    /**\n" +
                "     * Constructor with parameters\n" +
                "     */\n" +
                "    public Enemy(String fileName, int numberLine, int numberColumn, int width, int height, String movingType, int speed, int offense,int defence, int probability) {\n" +
                "        this.fileName = fileName;\n" +
                "        this.numberLine = numberLine;\n" +
                "        this.numberColumn = numberColumn;\n" +
                "        this.width = width;\n" +
                "        this.height = height;\n" +
                "        this.movingType = movingType;\n" +
                "        this.speed = speed;\n" +
                "        this.offense = offense;\n" +
                "        this.defence = defence;\n" +
                "        this.probability = probability;\n" +
                "    }\n\n";
    }

    private String getEnemyMethods() {
        String tempString = "";
        tempString += getGetter("FileName", "fileName", "String");
        tempString += getGetter("NumberLine", "numberLine", "int");
        tempString += getGetter("NumberColumn", "numberColumn", "int");
        tempString += getGetter("Width", "width", "int");
        tempString += getGetter("Height", "height", "int");
        tempString += getGetter("MovingType", "movingType", "String");
        tempString += getGetter("Speed", "speed", "int");
        tempString += getGetter("Offense", "offense", "int");
        tempString += getGetter("Defence", "defence", "int");
        tempString += getGetter("Probability", "probability", "int");

        return tempString;
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
                "    private int defence = " + enemy.getDefence() + ";\n" +
                "    private int probability = " + enemy.getProbability() + ";\n\n";
    }
}
