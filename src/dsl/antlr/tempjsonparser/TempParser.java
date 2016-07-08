package dsl.antlr.tempjsonparser;

import dsl.CodeGeneratorFunction;
import dsl.antlr.tempjsonparser.gen.MyGramBaseListener;
import dsl.antlr.tempjsonparser.gen.MyGramLexer;
import dsl.antlr.tempjsonparser.gen.MyGramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static java.util.Objects.isNull;

/**
 * Created by Jihed on 08.07.2016.
 *
 */
public class TempParser extends MyGramBaseListener {

    private static String globalString;
    private static String packageName = "dsl.antlr.jsonparser";
    private static String srcFile = "src/dsl/antlr/jsonparser/srcjson.txt";
    public static void main(String[] args) throws IOException {

        init();
        if(isNull(globalString)){
            return;
        }
        String className = "TestFromJson";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);


        codeGeneratorFunction.setHeader("");

        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
    }

    private static void init() throws IOException {
        FileReader fileReader = new FileReader(srcFile);
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileReader);
        // Get CSV lexer
        MyGramLexer lexer = new MyGramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        MyGramParser parser = new MyGramParser(tokens);
        // Specify our entry point
        MyGramParser.GramContext gramContext = parser.gram();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGramBaseListener listener = new TempParser();
        walker.walk(listener, gramContext);
    }

    public void exitGram(MyGramParser.GramContext ctx) {
        globalString = ctx.getText();
        int length = ctx.getRuleIndex();
        System.out.println("this is file content "+ctx.getText());
    }
}
