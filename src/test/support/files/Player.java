package test.support.files;

/**
 * creation : 2016/07/04 10:26
 */
public class Player {

    private String fileName = "test.png";
    private int numberLine = 1;
    private int numberColumn = 2;
    private int width = 3;
    private int height = 4;

    /**
     * Constructor without parameter
     */
    public Player() {
    }

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