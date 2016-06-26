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
public class CodeGeneratorFunction {

    private String workingString = "";
    private String path;
    private String className;
    private String packageName;

    /**
     * the path of the gen file will be created from the packageName
     *
     * @param packageName : name of class package
     * @param className   : name of gen class
     */
    public CodeGeneratorFunction(String packageName, String className){
        this.packageName = packageName;
        this.className = className;
        path = "src/" + packageName.replaceAll("\\.", "/") + "/" + className + ".java";
    }

    /**
     * set the header of the gen class
     */
    public void setHeader() {
        this.workingString = "package " + packageName + ";\n\n" +
                "import java.util.ArrayList;\n\n" +
                "/**\n * creation : " + getTime() +
                "\n */\n" +
                "class " + className + " {\n\n";
    }

    /**
     * set the content of class
     */
    public void setContent(String content){
        this.workingString += content;
    }

    /**
     * set the end of gen class
     */
    public void setFooter() {
        this.workingString += "}";
    }

    /**
     * create and generate file with
     *
     * @throws IOException
     * @path must be initialised in setHeader()
     * @workingString modified in every method
     */
    public void createAndWriteInFile() throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        writer.write(workingString);
        writer.flush();
        writer.close();
    }


    private String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

}
