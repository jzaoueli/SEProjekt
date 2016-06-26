package dsl.antlr.function;

import dsl.CodeGeneratorFunction;

import java.io.IOException;

/**
 * Bullet class generation
 */
public class BulletGeneratorFunction {
    private String content = "";

    public void run(String packageName) throws IOException {
        String className = "Bullet";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader("");

        setPlayerContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    private void setPlayerContent() {
        content += getBulletMemberVariable();
        content += getBulletConstructor();
        content += getBulletMethods();
    }

    private String getBulletConstructor() {
        return "      public Bullet(String fileName, int numberLine, int numberColumn, int width, int height) {\n" +
                "        this.fileName = fileName;\n" +
                "        this.numberLine = numberLine;\n" +
                "        this.numberColumn = numberColumn;\n" +
                "        this.width = width;\n" +
                "        this.height = height;\n" +
                "    }\n\n";
    }

    private String getBulletMethods() {
        String tempString = "";
        tempString += getGetter("FileName", "fileName", "String");
        tempString += getGetter("NumberLine", "numberLine", "int");
        tempString += getGetter("NumberColumn", "numberColumn", "int");
        tempString += getGetter("Width", "width", "int");
        tempString += getGetter("Height", "height", "int");

        return tempString;
    }

    private String getGetter(String MethodName, String fieldName, String retrunType) {
        return "    public " + retrunType + " get" + MethodName + "() {\n" +
                "        return " + fieldName + ";\n" +
                "    }\n\n";
    }

    private String getBulletMemberVariable() {
        return "    private String fileName = \"bullets.png\";\n" +
                "    private int numberLine = 1;\n" +
                "    private int numberColumn = 4;\n" +
                "    private int width = 12;\n" +
                "    private int height = 12;\n\n";
    }
}
