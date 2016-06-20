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
    public Rectangle boundingBox;
    private int lifePoints = 3;

    private String playerAction = "walk";
    public Player(FrameAnimation animation) throws IOException {
        this.playerAnimation = animation;
    }
    public String getAction() { return playerAction; }
    public void setAction(String action) {
        this.playerAction = action;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}