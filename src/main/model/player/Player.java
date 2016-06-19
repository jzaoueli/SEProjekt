package main.model.player;

import main.view.FrameAnimation;
import java.awt.*;
import java.io.IOException;

/**
 * Class implements Player
 * TODO
 */
public class Player{
    public FrameAnimation playerAnimation;
    Rectangle boundingBox;
    private String playerAction = "walk";
    public Player(FrameAnimation animation) throws IOException {
        this.playerAnimation = animation;
    }
    public String getAction() { return playerAction; }
    public void setAction(String action) {
        this.playerAction = action;
    }
}