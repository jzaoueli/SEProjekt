package main.generated.enemy;

import main.model.Enemy;
/**
 * creation : 2016/07/10 12:06
 */
public class CommonAttackEnemyData extends Enemy {

    private String fileName = "ecommonattack.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 32;
    private String movingType = "vertical";
    private int speed = 8;
    private int offense = 2;
    private int defence = 1;

    public Object[] getCommonAttackEnemyData() {
        return new Object[]{fileName, numberLine, numberColumn, width, height,
                movingType, speed, offense, defence};
    }

}