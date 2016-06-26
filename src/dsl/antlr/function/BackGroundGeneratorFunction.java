package dsl.antlr.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import main.generated.BackGround;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.CodeGeneratorFunction.getGetter;

/**
 * BackGround class generation
 */
public class BackGroundGeneratorFunction extends GramBaseListener {
    private static BackGround backGround;
    private String content = "";

    public void run(String packageName) throws IOException {
        initBackGround();

        String className = "BackGround";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader("");

        setBackGroundContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    private static BackGround initBackGround() throws IOException {
        FileReader fileReader = new FileReader("src/dsl/antlr/src.csv");
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
        backGround = new BackGround(ctx.backGround().fileName().getText());
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
        return getGetter("FileName", "fileName", "String");
    }

    private String getBackGroundMemberVariable() {
        return "    private String fileName = \"" + backGround.getFileName() + "\";\n\n";
    }
}
