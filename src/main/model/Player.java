package main.model;

import main.view.FrameAnimation;

import java.awt.*;
import java.io.IOException;

/**
 * Player TODO
 */
public class Player{

    public FrameAnimation playerAnimation;
    private int lifePoints;
    private int x;
    private int y;
    private int action;
    private Rectangle boundingBox;

    public Player(Object[] playerData) throws IOException {
        this.playerAnimation = new FrameAnimation(playerData, 16);
        this.playerAnimation.setActionFrames(getAction());
        this.setX(192);
        this.setY(400);
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), this.playerAnimation.sizeX, this.playerAnimation.sizeY));
    }

    public int getLifePoints() {
        return lifePoints;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    private int getAction(){
        return action;
    }
    public void setAction(int action) {
        this.action = action;
    }

    public int getY() {
        return y;
    }
    private void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    private void setBoundingBox(Rectangle boundingBox) {
        this.boundingBox = boundingBox;
    }
}