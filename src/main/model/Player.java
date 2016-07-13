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
        this.setPlayerData(playerData);
        this.setX(192);
        this.setY(400);
        this.setLifePoints(100);
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), this.playerAnimation.sizeX, this.playerAnimation.sizeY));
    }

    private void setPlayerData(Object[] bulletData) throws IOException {
        this.setPlayerAnimation(new FrameAnimation(bulletData, 8));
        this.playerAnimation.setActionFrames(0);
    }

    public void setMovement(String direction) {
        if (direction.equals("right")) {
            if (this.getX() <= 320) {
                this.setX(this.getX() + 4);
            }
        }
        if (direction.equals("left")) {
            if (this.getX() >= 32) {
                this.setX(this.getX() - 4);
            }
        }
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), this.playerAnimation.sizeX, this.playerAnimation.sizeY));
        if(direction.equals("down")){
            this.setY(this.getY() + 1);
        }
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

    public FrameAnimation getPlayerAnimation() {
        return playerAnimation;
    }

    private void setPlayerAnimation(FrameAnimation playerAnimation) {
        this.playerAnimation = playerAnimation;
    }
}