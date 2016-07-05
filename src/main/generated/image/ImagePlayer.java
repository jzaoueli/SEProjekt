package main.generated.image;

/**
 * creation : 2016/06/29 13:52
 */
public class ImagePlayer {

    private String fileName = "images/player.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 48;

    private Object[] playerImage = {fileName, numberLine, numberColumn, width, height};

    public Object[] getPlayerImage(){
        return playerImage;
    }

    // TODO Klasse wird nur bis hier benutzt

    /**
     * Constructor without parameter
     */
    public ImagePlayer() {
    }

    /**
     * Constructor with parameters
     */
    public ImagePlayer(String fileName, int numberLine, int numberColumn, int width, int height) {
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