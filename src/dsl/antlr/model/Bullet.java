package dsl.antlr.model;

/**
 * creation : 2016/07/07 16:47
 */
public class Bullet {

    private String fileName = "bullets.png";
    private int numberLine = 1;
    private int numberColumn = 4;
    private int width = 12;
    private int height = 12;

    /**
     * Constructor without parameter
     */
    public Bullet() {
    }

    /**
     * Constructor with parameters
     */
      public Bullet(String fileName, int numberLine, int numberColumn, int width, int height) {
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