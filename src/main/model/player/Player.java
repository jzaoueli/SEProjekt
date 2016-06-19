package main.model.player;

import main.view.FrameAnimation;
import java.awt.*;
import java.io.IOException;

/**
 * Class implements Player
 * TODO
 */
public class Player{
    public FrameAnimation frameAnimation;
    Rectangle boundingBox;
    private int xPos, yPos;
    private String playerAction = "walk";
    public Player(FrameAnimation animation) throws IOException {
        this.frameAnimation = animation;
    }
    public String getAction() { return playerAction; }
    public void setAction(String action) {
        this.playerAction = action;
    }
}