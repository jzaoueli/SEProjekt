package main.generated.bullet;

import main.model.Bullet;

/**
 * Created by Pi on 04.07.2016.
 */
public class BulletNormal extends Bullet {
    private String fileName = "bullets.png";
    private int numberLine = 1;
    private int numberColumn = 4;
    private int width = 12;
    private int height = 12;
    private int attack = 1;

    private Object[] bulletImage = {fileName, numberLine, numberColumn, width, height, attack};

    public Object[] getBulletImage(){
        return bulletImage;
    }
}
