package dsl.antlr.model;

/**
 * creation : 2016/07/07 16:47
 */
public class Player {

    private String fileName;
    private int numberLine;
    private int numberColumn;
    private int width;
    private int height;


    /**
     * Constructor with parameters
     */
    public Player(String fileName, int numberLine, int numberColumn, int width, int height) {
        this.fileName = fileName;
        this.numberLine = numberLine;
        this.numberColumn = numberColumn;
        this.width = width;
        this.height = height;
    }

    public String getFileName() {
        return fileName;
    }

    public int getNumberLine() {
        return numberLine;
    }

    public int getNumberColumn() {
        return numberColumn;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}