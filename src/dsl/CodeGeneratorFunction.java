package dsl;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * set up and generate java class
 * to use this function :
 * create instance of CodeGeneratorFunction and call
 * - instance.setHeader()
 * - instance.setClassContent()
 * - instance.setFooter
 */
class CodeGeneratorFunction {

    private String workingString = "";
    private String path;
    private String className;
    private String packageName;

    /**
     * the path of the generated file will be created from the packageName
     *
     * @param packageName : name of class package
     * @param className   : name of generated class
     */
    CodeGeneratorFunction(String packageName, String className){
        this.packageName = packageName;
        this.className = className;
        path = "src/" + packageName.replaceAll("\\.", "/") + "/" + className + ".java";
    }

    /**
     * set the header of the generated class

     */
    void setHeader() {
        this.workingString = "package " + packageName + ";\n\n" +
                "import java.util.ArrayList;\n\n" +
                "/**\n * creation : " + getTime() +
                "\n */\n" +
                "class " + className + " {\n\n";
    }

    /**
     * set the content of the class ImageData:
     * - member variable of ImageData
     * - methods of ImageData
     */
    void setImageDataContent() {
        this.workingString += getImageDataContentMemberVariable();
        this.workingString += setGetImageFilesMethod();
    }

    /**
     * set the end of generated class
     */
    void setFooter() {
        this.workingString += "}";
    }

    /**
     * create and generate file with
     *
     * @throws IOException
     * @path must be initialised in setHeader()
     * @workingString modified in every method
     */
    void createAndWriteInFile() throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        writer.write(workingString);
        writer.flush();
        writer.close();
    }

    private String setGetImageFilesMethod() {
        return "    static ArrayList<String[]> getImageFiles(){\n" +
                "        imageData.add(player);\n" +
                "        imageData.add(backGround);\n" +
                "\n" +
                "        return imageData;\n" +
                "    }\n";
    }

    private String getImageDataContentMemberVariable() {
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

    private String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

}
