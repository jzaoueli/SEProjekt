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
    public int x;
    public int y;
    public Rectangle boundingBox;
    public int state;

    public Bullet(int bulletType, FrameAnimation animation, int startX, int startY){
        this.type = bulletType;
        this.bulletAnimation = animation;
        this.setX(startX);
        this.setY(startY);
        this.bulletAnimation.setActionFrames(this.getState());
    }

    public void setMovement(int speed){
        this.setY(this.getY() - speed);
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), 12, 12));
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

    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(Rectangle rectangle) {
        this.boundingBox = rectangle;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
