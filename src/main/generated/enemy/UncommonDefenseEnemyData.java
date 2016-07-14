package main.generated.enemy;

import main.model.Enemy;

/**
 * creation : 2016/06/29 13:52
 */
public class UncommonDefenseEnemyData extends Enemy {

    private String fileName = "euncommondefense.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 48;
    private String movingType = "vertical";
    private int speed = 5;
    private int offense = 4;
    private int defence = 8;

    private Object[] commonAttackEnemyImageData
            = {fileName, numberLine, numberColumn, width, height,
            movingType, speed, offense, defence};

    public Object[] getUncommonDefenseEnemyData() {
        return commonAttackEnemyImageData;
    }
}