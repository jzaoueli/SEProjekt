package dsl.function;

import dsl.CodeGeneratorFunction;
import dsl.antlr.model.Item;
import dsl.antlr.recognition.MyGramBaseListener;
import dsl.antlr.recognition.MyGramLexer;
import dsl.antlr.recognition.MyGramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.valueOf;

/**
 * Item class generation
 */
public class ItemGeneratorFunction extends MyGramBaseListener {

    private Item item;
    private String packageName;

    private String content = "";
    private boolean noError = true;

    public ItemGeneratorFunction(String packageName) {
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
        MyGramBaseListener listener = new ItemGeneratorFunction(packageName);
        walker.walk(listener, fileContext);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        noError = false;
    }

    @Override
    public void exitItem(MyGramParser.ItemContext ctx) {
        String fileName, className, effect;
        int numberLine, numberColumn, width, height;
        if (noError) {
            className = ctx.className().getText();
            fileName = ctx.spriteObject().imageObject().fileName().getText();
            numberLine = valueOf(ctx.spriteObject().numberLine().value().getText());
            numberColumn = valueOf(ctx.spriteObject().numberColumn().value().getText());
            width = valueOf(ctx.spriteObject().width().value().getText());
            height = valueOf(ctx.spriteObject().height().value().getText());
            effect = ctx.effect().effectType().getText();
        } else {
            noError = true;
            return;
        }
        item = new Item(className, fileName, numberLine, numberColumn, width, height, effect);
        try {
            generateItem();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setItemContent() {
        content += getItemMemberVariable();
        content += getItemMethods();
    }

    private String getItemMethods() {
        return "    public Object[] get" + item.getItemName() + "Data() {\n" +
                "        return new Object[]{fileName, numberLine, numberColumn, width, height, effect};\n" +
                "    }\n";
    }

    private String getItemMemberVariable() {
        return "    private String fileName = \"" + item.getFileName() + "\";\n" +
                "    private int numberLine = " + item.getNumberLine() + ";\n" +
                "    private int numberColumn = " + item.getNumberColumn() + ";\n" +
                "    private int width = " + item.getWidth() + ";\n" +
                "    private int height = " + item.getHeight() + ";\n" +
                "    private String effect = \"" + item.getEffect() + "\";\n\n";
    }

    private void generateItem() throws IOException {
        String className = item.getItemName() + "Data";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);

        String importClass = "import main.model.Item;";
        String extendsClass = "extends Item";
        codeGeneratorFunction.setHeader(importClass, extendsClass);

        setItemContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
        System.out.println("- " + item.getItemName() + " is generated");
        content = "";
    }
}
