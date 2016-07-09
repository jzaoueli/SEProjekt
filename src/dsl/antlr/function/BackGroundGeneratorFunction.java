package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import dsl.antlr.model.BackGround;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.CodeGeneratorFunction.getConstructor;
import static dsl.CodeGeneratorFunction.getGetter;
import static java.util.Objects.isNull;

/**
 * BackGround class generation
 * TODO read input from srcjson.txt with MyGram instead Gram
 */
public class BackGroundGeneratorFunction extends GramBaseListener {
    private static BackGround backGround;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        if (isNull(initBackGround(src))) {
            return false;
        }

        String className = "BackGround";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader(null, null);

        setBackGroundContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        return true;
    }

    private static BackGround initBackGround(String src) throws IOException {
        FileReader fileReader = new FileReader(src);
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileReader);
        // Get CSV lexer
        GramLexer lexer = new GramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        GramParser parser = new GramParser(tokens);
        // Specify our entry point
        GramParser.FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        GramBaseListener listener = new BackGroundGeneratorFunction();
        walker.walk(listener, fileContext);
        return backGround;
    }

    public void exitFile(GramParser.FileContext ctx) {
        if (isNull(ctx.backGround().fileName().exception)) {
            backGround = new BackGround(ctx.backGround().fileName().getText());
        } else {
            backGround = null;
        }
    }

    private void setBackGroundContent() {
        content += getBackGroundMemberVariable();
        content += getConstructor("BackGround");
        content += getBackGroundConstructorWithParameters();
        content += getBackGroundMethod();
    }

    private String getBackGroundConstructorWithParameters() {
        return "    /**\n" +
                "     * Constructor with parameters\n" +
                "     */\n" +
                "    public BackGround(String fileName) {\n" +
                "        this.fileName = fileName;\n" +
                "    }\n\n";
    }

    private String getBackGroundMethod() {
        return getGetter("FileName", "fileName", "String");
    }

    private String getBackGroundMemberVariable() {
        return "    private String fileName = \"" + backGround.getFileName() + "\";\n\n";
    }
}
