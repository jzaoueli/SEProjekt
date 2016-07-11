package main.model;

import main.view.FrameAnimation;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Pi on 04.07.2016.
 */
public class Item {

    public FrameAnimation itemAnimation;
    private int x;
    private int y;
    private String effect;
    private Rectangle boundingBox;

    public Item() {
    }

    public Item(Object[] itemData, int startX, int startY) throws IOException {
        this.setX(startX);
        this.setY(startY);
        this.setItemData(itemData);
    }

    private void setItemData(Object[] bulletData) throws IOException {
        this.setItemAnimation(new FrameAnimation(bulletData, 8));
        this.itemAnimation.setActionFrames(0);
        this.setEffect(bulletData[5].toString());
    }

    public void setMovement(int x) {
        this.setY(this.getY() + x);
        this.setBoundingBox(new Rectangle(this.getX(), this.getY(), this.itemAnimation.sizeX, this.itemAnimation.sizeY));
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
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

    public void setBoundingBox(Rectangle boundingBox) {
        this.boundingBox = boundingBox;
    }

    public FrameAnimation getItemAnimation() {
        return itemAnimation;
    }

    public void setItemAnimation(FrameAnimation itemAnimation) {
        this.itemAnimation = itemAnimation;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
