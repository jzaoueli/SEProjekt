package main.generated.enemy;

import main.model.Enemy;

/**
 * creation : 2016/06/29 13:52
 */
public class RareDefenseEnemyData extends Enemy {

    private String fileName = "eraredefense.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 64;
    private int height = 64;
    private String movingType = "vertical";
    private int speed = 3;
    private int offense = 16;
    private int defence = 32;

    private Object[] commonAttackEnemyImageData
            = {fileName, numberLine, numberColumn, width, height,
            movingType, speed, offense, defence};

    public Object[] getRareDefenseEnemyData() {
        return commonAttackEnemyImageData;
    }
}