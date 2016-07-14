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
    private int speed;
    private int attack;
    private Rectangle boundingBox;

    public Bullet() {
    }

    public Bullet(Object[] bulletData, int startX, int startY) throws IOException {
        this.setX(startX);
        this.setY(startY);
        this.setBulletData(bulletData);
    }

    private void setBulletData(Object[] bulletData) throws IOException {
        this.setBulletAnimation(new FrameAnimation(bulletData, 8));
        this.bulletAnimation.setActionFrames(0);
        this.setAttack((int) bulletData[5]);
        this.setSpeed((int) bulletData[6]);
    }

    public void setMovement() {
        this.setY(this.getY() - this.getSpeed());
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), this.bulletAnimation.sizeX, this.bulletAnimation.sizeY));
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

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    private void setAttack(int attack) {
        this.attack = attack;
    }

    public FrameAnimation getBulletAnimation() {
        return bulletAnimation;
    }

    private void setBulletAnimation(FrameAnimation bulletAnimation) {
        this.bulletAnimation = bulletAnimation;
    }
}
