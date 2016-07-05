package main.generated.image;

/**
 * creation : 2016/06/29 13:52
 */
public class ImageBullet {

    private String fileName = "images/bullets.png";
    private int numberLine = 1;
    private int numberColumn = 4;
    private int width = 12;
    private int height = 12;

    private Object[] bulletImage = {fileName, numberLine, numberColumn, width, height};

    public Object[] getBulletImage(){
        return bulletImage;
    }

    // TODO Klasse wird nur bis hier benutzt

    /**
     * Constructor without parameter
     */
    public ImageBullet() {
    }

    /**
     * Constructor with parameters
     */
      public ImageBullet(String fileName, int numberLine, int numberColumn, int width, int height) {
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