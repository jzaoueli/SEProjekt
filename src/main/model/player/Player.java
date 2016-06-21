package main.model.player;

import main.view.FrameAnimation;
import java.awt.*;
import java.io.IOException;

/**
 * Player TODO
 */
public class Player{
    /**
     * Player Animation Frames
     */
    public FrameAnimation playerAnimation;
    private int lifePoints;
    public Rectangle playerDimension;
    boolean playerCollision;
    public int action = 0;

    /**
     * Player Constructor
     * @param animation Player Animation Frames
     * @throws IOException Frame Animation
     */
    public Player(FrameAnimation animation) throws IOException {
        this.playerAnimation = animation;
        this.playerAnimation.setActionFrames(0);
    }
    public int getAction(){
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
}