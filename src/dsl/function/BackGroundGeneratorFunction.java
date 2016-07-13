package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.model.BackGround;
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
 * BackGround class generation
 */
public class BackGroundGeneratorFunction extends MyGramBaseListener {
    private static BackGround backGround;
    private String packageName;

    private String content = "";
    private boolean noError = true;

    public BackGroundGeneratorFunction(String packageName) {
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
        MyGramBaseListener listener = new BackGroundGeneratorFunction(packageName);
        walker.walk(listener, fileContext);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        noError = false;
    }

    @Override
    public void exitBackground(MyGramParser.BackgroundContext ctx) {
        String fileName;
        if (noError) {
            fileName = ctx.imageObject().fileName().getText();
        } else {
            noError = true;
            return;
        }
        backGround = new BackGround(fileName);
        try {
            generateBackground();
        } catch (IOException e) {
            e.printStackTrace();
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

    private void generateBackground() throws IOException {
        String className = "ImageBackground";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        codeGeneratorFunction.setHeader(null, null);

        setBackGroundContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        System.out.println("- " + "Background" + " is generated");
        content = "";
    }
}
