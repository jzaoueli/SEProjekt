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
import java.util.ArrayList;

import static java.lang.Integer.valueOf;
import static java.util.Objects.isNull;

/**
 * Enemy class generation.
 */
public class EnemyGeneratorFunction extends MyGramBaseListener {
    private static ArrayList<Enemy> enemyList = new ArrayList<>();
    private static int sizeEnemy;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        if (isNull(initEnemy(src))) {
            return false;
        }

        for (int i = 0; i < sizeEnemy; i++) {
            if (!isNull(enemyList.get(i))) {
                String className = enemyList.get(i).getEnemyName() + "Data";
                CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

                String importClass = "import main.model.Enemy;";
                String extendsClass = "extends Enemy";
                codeGeneratorFunction.setHeader(importClass, extendsClass);

                setEnemyContent(i);

                codeGeneratorFunction.setContent(content);
                codeGeneratorFunction.setFooter();
                codeGeneratorFunction.createAndWriteInFile();
                System.out.println("- " + enemyList.get(i).getEnemyName() + " is generated");
                content = "";
            }
        }

        return true;
    }

    private static ArrayList<Enemy> initEnemy(String src) throws IOException {
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
        return enemyList;
    }

    public void exitGram(MyGramParser.GramContext ctx) {
        sizeEnemy = ctx.enemyCollection().enemy().size();
        for (int index = 0; index < sizeEnemy; index++) {

            if (!isNull(getEnemyData(ctx, index))) {
                enemyList.add(getEnemyData(ctx, index));
            } else {
                enemyList.add(null);
            }
        }
    }

    private Enemy getEnemyData(MyGramParser.GramContext ctx, int index) {
        String enemyName, fileName, movingType;
        int numberLine, numberColumn, width, height, attack, defence, speed, probability;

        if (isNull(ctx.enemyCollection().enemy(index).className().exception)) {
            enemyName = ctx.enemyCollection().enemy(index).className().getText();
        } else {
            System.out.println("please verify name of enemy:");
            System.out.println("        Ex: EnemyName{...}");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).spriteObject().imageObject().fileName().exception)) {
            fileName = ctx.enemyCollection().enemy(index).spriteObject().imageObject().fileName().getText();
        } else {
            System.out.println("please verify filename of enemy:");
            System.out.println("        Ex: file:[filename].[extension]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).spriteObject().numberLine().value().exception)) {
            numberLine = valueOf(ctx.enemyCollection().enemy(index).spriteObject().numberLine().value().getText());
        } else {
            System.out.println("please verify numberLine 'row' of enemy:");
            System.out.println("        Ex: row:[int]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).spriteObject().numberColumn().value().exception)) {
            numberColumn = valueOf(ctx.enemyCollection().enemy(index).spriteObject().numberColumn().value().getText());
        } else {
            System.out.println("please verify numberColumn 'column' of enemy:");
            System.out.println("        Ex: column:[int]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).spriteObject().width().value().exception)) {
            width = valueOf(ctx.enemyCollection().enemy(index).spriteObject().width().value().getText());
        } else {
            System.out.println("please verify width of enemy:");
            System.out.println("        Ex: width:[int]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).spriteObject().height().value().exception)) {
            height = valueOf(ctx.enemyCollection().enemy(index).spriteObject().height().value().getText());
        } else {
            System.out.println("please verify height of enemy:");
            System.out.println("        Ex: height:[int]");
            return null;
        }

        if (isNull(ctx.enemyCollection().enemy(index).movement().movingType().exception)) {
            movingType = ctx.enemyCollection().enemy(index).movement().movingType().getText();
        } else {
            System.out.println("please verify movingType of enemy:");
            System.out.println("        Ex: movingType:[zigzag,vertical,continue]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).attack().value().exception)) {
            attack = valueOf(ctx.enemyCollection().enemy(index).attack().value().getText());
        } else {
            System.out.println("please verify attack of enemy :");
            System.out.println("        Ex: attack:[int]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).defense().value().exception)) {
            defence = valueOf(ctx.enemyCollection().enemy(index).defense().value().getText());
        } else {
            System.out.println("please verify value defence of enemy:");
            System.out.println("        Ex: defence:[int]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).speed().value().exception)) {
            speed = valueOf(ctx.enemyCollection().enemy(index).speed().value().getText());
        } else {
            System.out.println("please verify value speed of enemy :");
            System.out.println("        Ex: speed:[int]");
            return null;
        }
        if (isNull(ctx.enemyCollection().enemy(index).probability().value().exception)) {
            probability = valueOf(ctx.enemyCollection().enemy(index).probability().value().getText());
        } else {
            System.out.println("please verify probability of enemy :");
            System.out.println("        Ex: probability:[int]");
            return null;
        }
        return new Enemy(enemyName, fileName, numberLine, numberColumn, width, height, movingType, speed, attack, defence, probability);
    }

    private void setEnemyContent(int index) {
        content += getEnemyMemberVariable(index);
        content += getEnemyMethods(index);
    }

    private String getEnemyMethods(int index) {
        return "    public Object[] get" + enemyList.get(index).getEnemyName() + "Data() {\n" +
                "        return new Object[]{fileName, numberLine, numberColumn, width, height,\n" +
                "                movingType, speed, offense, defence, probability};\n" +
                "    }\n";
    }

    private String getEnemyMemberVariable(int index) {
        return "    private String fileName = \"" + enemyList.get(index).getFileName() + "\";\n" +
                "    private int numberLine = " + enemyList.get(index).getNumberLine() + ";\n" +
                "    private int numberColumn = " + enemyList.get(index).getNumberColumn() + ";\n" +
                "    private int width = " + enemyList.get(index).getWidth() + ";\n" +
                "    private int height = " + enemyList.get(index).getHeight() + ";\n" +
                "    private String movingType = \"" + enemyList.get(index).getMovingType() + "\";\n" +
                "    private int speed = " + enemyList.get(index).getSpeed() + ";\n" +
                "    private int offense = " + enemyList.get(index).getOffense() + ";\n" +
                "    private int defence = " + enemyList.get(index).getDefence() + ";\n" +
                "    private int probability = " + enemyList.get(index).getProbability() + ";\n\n";
    }
}
