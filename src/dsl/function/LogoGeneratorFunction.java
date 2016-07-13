package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.model.Logo;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.CodeGeneratorFunction.getGetter;

/**
 * Logo class generation
 */
public class LogoGeneratorFunction extends MyGramBaseListener {
    private static Logo logo;
    private String packageName;

    private String content = "";
    private boolean noError = true;

    public LogoGeneratorFunction(String packageName) {
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
        MyGramBaseListener listener = new LogoGeneratorFunction(packageName);
        walker.walk(listener, fileContext);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        noError = false;
    }

    @Override
    public void exitLogo(MyGramParser.LogoContext ctx) {
        String fileName;
        if (noError) {
            fileName = ctx.imageObject().fileName().getText();
        } else {
            noError = true;
            return;
        }
        logo = new Logo(fileName);
        try {
            generateLogo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setLogoContent() {
        content += getLogoMemberVariable();
        content += getLogoMethod();
    }

    private String getLogoMethod() {
        return getGetter("FileName", "fileName", "String");
    }

    private String getLogoMemberVariable() {
        return "    private String fileName = \"" + logo.getFileName() + "\";\n\n";
    }

    private void generateLogo() throws IOException {
        String className = "ImageLogo";
        CodeGeneratorFunction codeGeneratorFunction =  new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader(null, null);

        setLogoContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        System.out.println("- " + "Logo" + " is generated");
        content = "";
    }
}
