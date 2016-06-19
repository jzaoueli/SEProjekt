package dsl;

import java.io.IOException;

/**
 * Generates ImageFiles.java
 * using CodeGeneratorFunction
 */
public class CodeGenerator {

    public static void main(String[] args) throws IOException {
        String packageName = "view", className = "ImageDate";

        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader();
        codeGeneratorFunction.setImageDataContent();
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
    }
}
