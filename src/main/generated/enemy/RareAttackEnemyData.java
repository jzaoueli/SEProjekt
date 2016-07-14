package main.generated.enemy;

import main.model.Enemy;

/**
 * creation : 2016/06/29 13:52
 */
public class RareAttackEnemyData extends Enemy {

    private String fileName = "erareattack.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 80;
    private int height = 64;
    private String movingType = "vertical";
    private int speed = 4;
    private int offense = 32;
    private int defence = 16;

    private Object[] commonAttackEnemyImageData
            = {fileName, numberLine, numberColumn, width, height,
            movingType, speed, offense, defence};

    public Object[] getRareAttackEnemyData() {
        return commonAttackEnemyImageData;
    }
}