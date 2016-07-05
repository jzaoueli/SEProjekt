package main.model;

import main.view.FrameAnimation;

import java.awt.*;
import java.io.IOException;

/**
 * TODO Documentation
 */
public class Bullet {

    public FrameAnimation bulletAnimation;
    private int x;
    private int y;
    public int speed;
    private int attack;
    private Rectangle boundingBox;


    public Bullet() {
    }

    Bullet(Object[] bulletData, int startX, int startY, int speed) throws IOException {
        this.bulletAnimation = new FrameAnimation(bulletData, 4);
        this.bulletAnimation.setActionFrames(0);
        this.setX(startX);
        this.setY(startY);
        this.setSpeed(speed);
        this.setAttack((int) bulletData[5]);
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), this.bulletAnimation.sizeX, this.bulletAnimation.sizeY));
    }

    public void setMovement(){
        this.setY(this.getY() - this.getSpeed());
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), 12, 12));
    }
    public int getX() {
        return x;
    }
    private void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Rectangle getBoundingBox() {
        return boundingBox;
    }
    private void setBoundingBox(Rectangle rectangle) {
        this.boundingBox = rectangle;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    private void setAttack(int attack) {
        this.attack = attack;
    }
}
