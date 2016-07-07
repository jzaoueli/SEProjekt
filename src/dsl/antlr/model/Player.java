package dsl.antlr.model;

/**
 * creation : 2016/07/07 16:47
 */
public class Player {

    private String fileName = "player.png";
    private int numberLine = 2;
    private int numberColumn = 3;
    private int width = 32;
    private int height = 48;


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