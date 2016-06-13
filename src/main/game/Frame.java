package main.game;

import java.awt.image.BufferedImage;

/**
 * Created by Pi on 10.06.2016.
 * The Frame Class holds a Sprite and a Duration associated with that Sprite.
 */
public class Frame {

    private BufferedImage frame;
    private int duration;

    public Frame(BufferedImage frame, int duration) {
        this.frame = frame;
        this.duration = duration;
    }
    /**
     *
     * */
    public BufferedImage getFrame() {
        return frame;
    }

    public void setFrame(BufferedImage frame) {
        this.frame = frame;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}