package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import dsl.antlr.model.BackGround;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.CodeGeneratorFunction.getGetter;
import static java.util.Objects.isNull;

/**
 * BackGround class generation
 */
public class BackGroundGeneratorFunction extends MyGramBaseListener {
    private static BackGround backGround;
    private String content = "";

    public boolean run(String packageName, String src) throws IOException {
        if (isNull(initBackGround(src))) {
            return false;
        }

        String className = "ImageBackground";
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
        MyGramLexer lexer = new MyGramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        MyGramParser parser = new MyGramParser(tokens);
        // Specify our entry point
        MyGramParser.GramContext fileContext = parser.gram();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGramBaseListener listener = new BackGroundGeneratorFunction();
        walker.walk(listener, fileContext);
        return backGround;
    }

    public void exitGram(MyGramParser.GramContext ctx) {
        if (isNull(ctx.images().background().imageObject().fileName().exception)) {
            backGround = new BackGround(ctx.images().background().imageObject().fileName().getText());
        } else {
            backGround = null;
        }
    }

    private void setBackGroundContent() {
        content += getBackGroundMemberVariable();
        content += getBackGroundMethod();
    }

    private String getBackGroundMethod() {
        return getGetter("FileName", "fileName", "String");
    }

    private String getBackGroundMemberVariable() {
        return "    private String fileName = \"" + backGround.getFileName() + "\";\n\n";
    }
}
