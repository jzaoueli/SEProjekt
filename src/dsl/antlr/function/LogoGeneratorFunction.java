package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import dsl.antlr.model.Logo;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.CodeGeneratorFunction.getConstructor;
import static dsl.CodeGeneratorFunction.getGetter;
import static java.util.Objects.isNull;

/**
 * Logo class generation
 */
public class LogoGeneratorFunction extends MyGramBaseListener {
    private static Logo logo;
    private String content = "";

    public boolean run(String packageName, String srcFile) throws IOException {
        initLogo(srcFile);

        String className = "Logo";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        if(isNull(logo)){
            return false;
        }

        codeGeneratorFunction.setHeader("");

        setLogoContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        return true;
    }

    private static Logo initLogo(String srcFile) throws IOException {
        FileReader fileReader = new FileReader(srcFile);
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
        MyGramBaseListener listener = new LogoGeneratorFunction();
        walker.walk(listener, fileContext);
        return logo;
    }

    public void exitGram(MyGramParser.GramContext ctx) {
        if (isNull(ctx.images().logo().imageObject().fileName().exception)) {
            logo = new Logo(ctx.images().logo().imageObject().fileName().getText());
        } else {
            logo = null;
        }
    }

    private void setLogoContent() {
        content += getLogoMemberVariable();
        content += getConstructor("Logo");
        content += getLogoConstructorWithParameters();
        content += getLogoMethod();
    }

    private String getLogoConstructorWithParameters() {
        return "    /**\n" +
                "     * Constructor with parameters\n" +
                "     */\n" +
                "    public Logo(String fileName) {\n" +
                "        this.fileName = fileName;\n" +
                "    }\n\n";
    }

    private String getLogoMethod() {
        return getGetter("FileName", "fileName", "String");
    }

    private String getLogoMemberVariable() {
        return "    private String fileName = \""+logo.getFileName()+"\";\n\n";
    }

}
