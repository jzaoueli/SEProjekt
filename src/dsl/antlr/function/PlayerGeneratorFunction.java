package dsl.antlr.function;

import dsl.CodeGeneratorFunction;

import java.io.IOException;

/**
 * player class generation
 */
public class PlayerGeneratorFunction {
    private String content = "";

    public void run(String packageName) throws IOException {
        String className = "Player";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader("");

        setPlayerContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    private void setPlayerContent() {
        content += getPlayerMemberVariable();
        content += getPlayerConstructor();
        content += getPlayerMethods();
    }

    private String getPlayerConstructor() {
        return  "      public Player(String fileName, int numberLine, int numberColumn, int width, int height) {\n" +
                "        this.fileName = fileName;\n" +
                "        this.numberLine = numberLine;\n" +
                "        this.numberColumn = numberColumn;\n" +
                "        this.width = width;\n" +
                "        this.height = height;\n" +
                "    }\n\n";
    }

    private String getPlayerMethods() {
        String tempString = "";
        tempString += getGetter("FileName", "fileName", "String");
        tempString += getGetter("NumberLine", "numberLine", "int");
        tempString += getGetter("NumberColumn", "numberColumn", "int");
        tempString += getGetter("Width", "width", "int");
        tempString += getGetter("Height", "height", "int");

        return tempString;
    }

    private String getGetter(String MethodName, String fieldName, String retrunType) {
        return  "    public " + retrunType + " get" + MethodName + "() {\n" +
                "        return " + fieldName + ";\n" +
                "    }\n\n";
    }

    private String getPlayerMemberVariable() {
        return  "    private String fileName = \"player.png\";\n" +
                "    private int numberLine = 3;\n" +
                "    private int numberColumn = 4;\n" +
                "    private int width = 32;\n" +
                "    private int height = 48;\n\n";
    }
}
