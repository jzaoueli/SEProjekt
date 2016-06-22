package main.model.player;

import main.view.FrameAnimation;

import java.awt.*;

/**
 * Created by ordencaos on 19.06.16.
 * TODO
 */
public class Bullet {

    private int type;
    public FrameAnimation bulletAnimation;
    private int x;
    private int y;
    private int Width;
    private int Height;
    private Rectangle boundingBox;

    public Bullet(int bulletType, FrameAnimation animation, int startX, int startY){
        this.type = bulletType;
        this.bulletAnimation = animation;
        this.bulletAnimation.setActionFrames(0);
        this.setX(startX);
        this.setY(startY);
    }

    public void setMovement(int speed){
        this.setY(this.getY() - speed);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
