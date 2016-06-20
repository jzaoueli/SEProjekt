package main.model.enemy;
import main.view.FrameAnimation;
import java.awt.*;

/**
 * Created by ordencaos on 19.06.16.
 * Enemy Class
 * TODO
 */
public class Enemy {

    private FrameAnimation enemyAnimation;
    private String type;
    private String file;
    private String movement;
    private int speed;
    private int attack, defense;
    private float probability;
    private int enemyX, enemyY;
    int startX, startY;
    private Rectangle boundingBox;

    public Enemy(String type){
        Enemy enemy;
        FrameAnimation animation;
        this.type = type;
        switch (type){
            case "attack":

        }
    }

    public Enemy(FrameAnimation animation, String movement, int speed, int attack, int defense, float probability){
        this.enemyAnimation = animation;
        this.movement = movement;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.probability = probability;
        this.boundingBox = new Rectangle(enemyX, enemyY, this.enemyAnimation.sizeX, this.enemyAnimation.sizeY);
    }

    public void setMovement(String movement, int speed){
        int tempX = enemyX;
        int tempY = enemyY;
        boolean right = false, left = false;

        switch (movement){
            case "vertical":
                this.enemyY += speed;
            case "zigzag":
                this.enemyY += speed;
                if(enemyX < tempX + 32){
                    this.enemyX++;
                }
                else if(enemyX > tempX - 32){
                    this.enemyX--;
                }
        }
    }
}
