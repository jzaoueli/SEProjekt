package main.generated.bullet;

import main.model.Bullet;
/**
 * creation : 2016/07/09 22:49
 */
public class BulletNormal extends Bullet {

    private String fileName = "bullets.png";
    private int numberLine = 1;
    private int numberColumn = 4;
    private int width = 12;
    private int height = 12;
    private int attack = 1;

    public Object[] getBulletImage(){
        return new Object[]{fileName, numberLine, numberColumn, width, height, attack};
    }
}