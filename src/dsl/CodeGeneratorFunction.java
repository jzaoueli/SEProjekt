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
    public CodeGeneratorFunction(String packageName, String className) {
        this.packageName = packageName;
        this.className = className;
        path = "src/" + packageName.replaceAll("\\.", "/") + "/" + className + ".java";
    }

    /**
     * set the header of the gen class
     */
    public void setHeader(String imported) {
        this.workingString = "package " + packageName + ";\n\n" +
                imported +
                "/**\n * creation : " + getTime() +
                "\n */\n" +
                "public class " + className + " {\n\n";
    }

    /**
     * set the content of class
     */
    public void setContent(String content) {
        this.workingString += content;
    }

    /**
     * set the end of gen class
     */
    public void setFooter() {
        this.workingString += "\n}";
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

    /**
     * return the Constructor of specific class
     *
     * @param className name of Constructor
     */
    public static String getConstructor(String className) {
        return "    /**\n" +
                "     * Constructor without parameter\n" +
                "     */\n" +
                "    public " + className + "() {\n" +
                "    }\n\n";
    }

    public static String getGetter(String MethodName, String fieldName, String retrunType) {
        return "    public " + retrunType + " get" + MethodName + "() {\n" +
                "        return " + fieldName + ";\n" +
                "    }\n\n";
    }

    private String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

}
