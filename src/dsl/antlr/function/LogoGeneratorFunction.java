package dsl.antlr.function;

import dsl.CodeGeneratorFunction;

import java.io.IOException;

/**
 * Logo class generation
 */
public class LogoGeneratorFunction {
    private String content = "";

    public void run(String packageName) throws IOException {
        String className = "Logo";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader("");

        setLogoContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    private void setLogoContent() {
        content += getLogoMemberVariable();
        content += getLogoConstructor();
        content += getLogoMethod();
    }

    private String getLogoConstructor() {
        return "    public Logo(String fileName){\n" +
                "        this.fileName = fileName;\n" +
                "    }\n\n";
    }

    private String getLogoMethod() {
        return "    public String getFileName() {\n" +
                "        return fileName;\n" +
                "    }\n\n";
    }

    private String getLogoMemberVariable() {
        return "    private String fileName = \"logo.jpg\";\n\n";
    }

}
