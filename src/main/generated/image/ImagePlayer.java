package main.generated.image;

/**
 * creation : 2016/06/29 13:52
 */
public class ImagePlayer {

    private String fileName = "player.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 48;

    private Object[] playerImage = {fileName, numberLine, numberColumn, width, height};

    public Object[] getPlayerImage() {
        return playerImage;
    }


}