package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.model.Enemy;
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
 * Enemy class generation.
 */
public class EnemyGeneratorFunction extends MyGramBaseListener {
    private static Enemy enemy;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        if (isNull(initEnemy(src))) {
            return false;
        }

        String className = "CommonAttackEnemyData";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        String importClass = "import main.model.Enemy;";
        String extendsClass = "extends Enemy";
        codeGeneratorFunction.setHeader(importClass, extendsClass);

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
        MyGramLexer lexer = new MyGramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        MyGramParser parser = new MyGramParser(tokens);
        // Specify our entry point
        MyGramParser.GramContext fileContext = parser.gram();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGramBaseListener listener = new EnemyGeneratorFunction();
        walker.walk(listener, fileContext);
        return enemy;
    }

    public void exitGram(MyGramParser.GramContext ctx) {
        String fileName, movingType;
        int numberLine, numberColumn, width, height, attack, defence, speed, probability;
        if (isNull(ctx.enemy().spriteObject().imageObject().fileName().exception)) {
            fileName = ctx.enemy().spriteObject().imageObject().fileName().getText();
        } else {
            System.out.println("please verify filename of enemy:");
            System.out.println("        Ex: file:[filename].[extension]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().spriteObject().numberLine().value().exception)) {
            numberLine = valueOf(ctx.enemy().spriteObject().numberLine().value().getText());
        } else {
            System.out.println("please verify numberLine 'row' of enemy:");
            System.out.println("        Ex: row:[int]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().spriteObject().numberColumn().value().exception)) {
            numberColumn = valueOf(ctx.enemy().spriteObject().numberColumn().value().getText());
        } else {
            System.out.println("please verify numberColumn 'column' of enemy:");
            System.out.println("        Ex: column:[int]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().spriteObject().width().value().exception)) {
            width = valueOf(ctx.enemy().spriteObject().width().value().getText());
        } else {
            System.out.println("please verify width of enemy:");
            System.out.println("        Ex: width:[int]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().spriteObject().height().value().exception)) {
            height = valueOf(ctx.enemy().spriteObject().height().value().getText());
        } else {
            System.out.println("please verify height of enemy:");
            System.out.println("        Ex: height:[int]");
            enemy = null;
            return;
        }

        if (isNull(ctx.enemy().movement().movingType().exception)) {
            movingType = ctx.enemy().movement().movingType().getText();
        } else {
            System.out.println("please verify movingType of enemy:");
            System.out.println("        Ex: movingType:[zigzag,vertical,continue]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().attack().value().exception)) {
            attack = valueOf(ctx.enemy().attack().value().getText());
        } else {
            System.out.println("please verify attack of enemy :");
            System.out.println("        Ex: attack:[int]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().defense().value().exception)) {
            defence = valueOf(ctx.enemy().defense().value().getText());
        } else {
            System.out.println("please verify value defence of enemy:");
            System.out.println("        Ex: defence:[int]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().speed().value().exception)) {
            speed = valueOf(ctx.enemy().speed().value().getText());
        } else {
            System.out.println("please verify value speed of enemy :");
            System.out.println("        Ex: speed:[int]");
            enemy = null;
            return;
        }
        if (isNull(ctx.enemy().probability().value().exception)) {
            probability = valueOf(ctx.enemy().probability().value().getText());
        } else {
            System.out.println("please verify probability of enemy :");
            System.out.println("        Ex: probability:[int]");
            enemy = null;
            return;
        }
        enemy = new Enemy(fileName, numberLine, numberColumn, width, height, movingType, speed, attack, defence, probability);
    }

    private void setEnemyContent() {
        content += getEnemyMemberVariable();
        content += getEnemyMethods();
    }

    private String getEnemyMethods() {
        return "    public Object[] getCommonAttackEnemyData() {\n" +
                "        return new Object[]{fileName, numberLine, numberColumn, width, height,\n" +
                "                movingType, speed, offense, defence, probability};\n" +
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
                "    private int defence = " + enemy.getDefence() + ";\n" +
                "    private int probability = " + enemy.getProbability() + ";\n\n";
    }
}
