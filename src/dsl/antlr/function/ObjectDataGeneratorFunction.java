package dsl.antlr.function;

import dsl.CodeGeneratorFunction;

import java.io.IOException;

/**
 * generate objectData class
 */
public class ObjectDataGeneratorFunction {

    private String content ="";

    public void run(String packageName) throws IOException {
        String className = "ObjectData";
        String imported = "import java.util.ArrayList;\n\n";
        CodeGeneratorFunction codeGeneratorFunction = new CodeGeneratorFunction(packageName, className);
        codeGeneratorFunction.setHeader(imported);

        setImageDataContent();

        codeGeneratorFunction.setContent(content);
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();

    }

    /**
     * set the content of the class ImageData:
     * - member variable of ImageData
     * - methods of ImageData
     */
    private void setImageDataContent() {
        this.content += getImageDataMemberVariable();
        this.content += getImageFilesMethod();
    }

    private String getImageFilesMethod() {
        return "    static ArrayList<String[]> getImageFiles(){\n" +
                "        imageData.add(player);\n" +
                "        imageData.add(backGround);\n" +
                "\n" +
                "        return imageData;\n" +
                "    }\n";
    }

    private String getImageDataMemberVariable() {
        String imageData = getImageDataVariableDeclaration();
        String player = getPlayerVariableDeclaration();
        String backGround = getBackGroundVariableDeclaration();
        return imageData + "\n" + player + "\n" + backGround + "\n\n";
    }

    //TODO get background file from csv file with antlr
    private String getBackGroundVariableDeclaration() {
        return "    private static String[] backGround = {\"Sheets/bground.jpg\"};";
    }

    //TODO get Player value from csv file with antlr
    private String getPlayerVariableDeclaration() {
        return "    static String[] player = {\"Sheets/player.png\", \"3\", \"4\", \"32\", \"48\"};";
    }

    private String getImageDataVariableDeclaration() {
        return "    static ArrayList<String[]> imageData = new ArrayList<>();";
    }
}
