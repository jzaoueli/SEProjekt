package model.player;

import view.FrameAnimation;

import java.awt.*;
import java.io.IOException;

/**
 * Class implements Player
 */
public class Player{

    Rectangle boundingBox;
    private String playerAction = "walk";

    public Player(FrameAnimation animation) throws IOException {
        animation.setActionFrames(animation.frames, 0);
    }

    public String getAction() {
        return playerAction;
    }

    public void setAction(String action) {
        this.playerAction = action;
    }

    void updatePlayerFrames(String playerAction){

    }
}
