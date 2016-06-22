package dsl.antlr;

import dsl.antlr.generated.GramBaseListener;
import dsl.antlr.generated.GramLexer;
import dsl.antlr.generated.GramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;
import java.util.jar.Attributes;

/**
 * read data from CSV file and give the necessary
 * Background: path of background image file.
 * Player: player image, line, column, width, height;
 */
public class StringParser extends GramBaseListener {

    public static void main(String[] args) throws IOException {

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
        GramBaseListener listener = new GramBaseListener();
        walker.walk(listener, fileContext);
    }
    public void exitFile(GramParser.FileContext ctx) {
        System.out.println("If no error outputs occurred, then file has valid format!");
        //System.out.println(ctx.getText());
        System.out.println("player row : " + ctx.playerRow());
        //System.out.println(ctx.playerRow().getChild(0).getText());
    }
}
