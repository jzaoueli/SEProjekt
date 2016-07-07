package dsl.antlr.model;

/**
 * creation : 2016/07/07 16:47
 */
public class BackGround {

    private String fileName = "background.jpg";

    /**
     * Constructor without parameter
     */
    public BackGround() {
    }

    /**
     * Constructor with parameters
     */
    public BackGround(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }


}