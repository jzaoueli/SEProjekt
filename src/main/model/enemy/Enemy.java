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
     * Enemy x start position
     */
    int startX;
    /**
     * Area of Collision
     */
    private Rectangle boundingBox;

    /**
     * TODO Inititialisierung kann in Control stattfinden???
     */
    private ObjectData objectData = new ObjectData();
    private String[] enemyData;

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
        switch (enemyType){
            case 1:
                enemyData = ObjectData.enemyData.get(0);
                setEnemyData(enemyData);
        }
    }

    public void setMovement(int movementType, int speed){
        switch (movementType){
            case 1:
                this.setY(this.getY() + speed);
        }
    }


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
