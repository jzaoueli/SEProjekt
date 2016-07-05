package main.generated.enemy;

import main.model.Enemy;

/**
 * creation : 2016/06/29 13:52
 */
public class UncommonAttackEnemyData extends Enemy {

    private String fileName = "images/e_uncommonattack.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 64;
    private int height = 64;
    private String movingType = "vertical";
    private int speed = 6;
    private int offense = 8;
    private int defence = 4;
    private int probability = 8;

    private Object[] commonAttackEnemyImageData
            = {fileName, numberLine, numberColumn, width, height,
            movingType, speed, offense, defence, probability};

    public Object[] getUncommonAttackEnemyData() {
        return commonAttackEnemyImageData;
    }
}