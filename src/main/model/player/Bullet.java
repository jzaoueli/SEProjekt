package main.model.player;

import main.view.FrameAnimation;

import java.awt.*;

/**
 * Created by ordencaos on 19.06.16.
 * TODO
 */
public class Bullet {

    int type;
    private FrameAnimation bulletAnimation;
    private int x;
    private int y;
    int Width;
    int Height;
    Rectangle boundingBox;

    public Bullet(int bulletType, FrameAnimation animation, int x, int y){
        this.bulletAnimation = animation;
        this.setX(x);
        this.setY(y);

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
