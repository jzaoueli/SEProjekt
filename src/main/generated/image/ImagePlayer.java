package main.generated.image;

/**
 * creation : 2016/07/14 01:17
 */
public class ImagePlayer {

    private String fileName = "player.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 48;

    public Object[] getPlayerImage() {
        return new Object[]{fileName, numberLine, numberColumn, width, height};
    }
}