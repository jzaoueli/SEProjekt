package dsl.antlr.function;

import dsl.CodeGeneratorFunction;

import java.io.IOException;

/**
 * BackGround class generation
 */
public class BackGroundGeneratorFunction {
    private String content = "";

    public void run(String packageName) throws IOException {
        String className = "BackGround";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader("");

        setBackGroundContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    private void setBackGroundContent() {
        content += getBackGroundMemberVariable();
        content += getBackGroundConstructor();
        content += getBackGroundMethod();
    }

    private String getBackGroundConstructor() {
        return "    public BackGround(String fileName){\n" +
                "        this.fileName = fileName;\n" +
                "    }\n\n";
    }

    private String getBackGroundMethod() {
        return "    public String getFileName() {\n" +
                "        return fileName;\n" +
                "    }\n\n";
    }

    private String getBackGroundMemberVariable() {
        return "    private String fileName = \"background.jpg\";\n\n";
    }
}
