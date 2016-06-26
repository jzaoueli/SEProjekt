package dsl.antlr.function;

import dsl.CodeGeneratorFunction;

import java.io.IOException;

/**
 * Enemy class generation.
 */
public class EnemyGeneratorFunction {
    private String content = "";

    public void run(String packageName) throws IOException {
        String className = "Enemy";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader("");

        setEnemyContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    private void setEnemyContent() {
        content += getEnemyMemberVariable();
        content += getEnemyConstructor();
        content += getEnemyMethods();
    }

    private String getEnemyConstructor() {
        return "    public Enemy(String fileName, int numberLine, int numberColumn, int width, int height, String movingType, int speed, int offense,int defence, int probability) {\n" +
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

    private String getGetter(String MethodName, String fieldName, String retrunType) {
        return "    public " + retrunType + " get" + MethodName + "() {\n" +
                "        return " + fieldName + ";\n" +
                "    }\n\n";
    }

    private String getEnemyMemberVariable() {
        return "    private String fileName = \"attack.png\";\n" +
                "    private int numberLine = 3;\n" +
                "    private int numberColumn = 4;\n" +
                "    private int width = 32;\n" +
                "    private int height = 32;\n" +
                "    private String movingType = \"vertical\";\n" +
                "    private int speed = 8;\n" +
                "    private int offense = 2;\n" +
                "    private int defence = 1;\n" +
                "    private int probability = 1;\n\n";
    }
}
