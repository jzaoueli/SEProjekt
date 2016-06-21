package main.model.enemy;
import main.view.*;
import java.awt.*;

/**
 * Created by ordencaos on 19.06.16.
 * Enemy Class
 * TODO
 */
public class Enemy {
    /**
     * Enemy Type
     */
    private int type;
    /**
     * Enemy Animation Frames
     */
    public FrameAnimation enemyAnimation;
    /**
     * Enemy Movement Type
     */
    private String movement;
    /**
     * Enemy speed
     */
    private int speed;
    /**
     * Enemy Attack or Players LifePoints loss
     */
    private int attack;
    /**
     * Enemy Defense or Player Hits needed for Kill
     */
    private int defense;
    /**
     * Probability the Enemy will appear
     */
    private float probability;
    /**
     * Enemy Coordinates
     */
    private int x;
    private int y;
    /**
     * Area of Collision
     */
    private Rectangle boundingBox;

    /**
     * Enemy Constructor
     * @param enemyType Enemy Type
     * @param animation Enemy Animation Frames
     * @param startX Enemy x start position
     */
    public Enemy(int enemyType, FrameAnimation animation, int startX){
        this.type = enemyType;
        this.enemyAnimation = animation;
        this.setX(startX);
        this.enemyAnimation.setActionFrames(0);
    }

    /**
     * Sets Enemy Movement
     * @param movementType Enemy Movement Type
     * @param speed Enemy speed
     */
    public void setMovement(int movementType, int speed){
        this.setY(this.getY() + speed);
    }

    /**
     * Sets Enemy Data
     * @param enemyData String Array of loaded ObjectData
     */
    private void setEnemyData(String[] enemyData){
        this.speed = Integer.valueOf(enemyData[6]);
        this.attack = Integer.valueOf(enemyData[7]);
        this.defense = Integer.valueOf(enemyData[8]);
        this.probability = Float.valueOf(enemyData[9]);
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
    private void setX(int x) {
        this.x = x;
    }
}
