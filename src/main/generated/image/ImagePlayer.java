package main.generated.image;

/**
 * creation : 2016/07/07 17:27
 */
public class ImagePlayer {

    private String fileName = "player.png";
    private int numberLine = 2;
    private int numberColumn = 3;
    private int width = 32;
    private int height = 48;

    public Object[] getPlayerImage() {
        return new Object[]{fileName, numberLine, numberColumn, width, height};
    }
}