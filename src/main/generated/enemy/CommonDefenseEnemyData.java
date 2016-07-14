package main.generated.enemy;

import main.model.Enemy;

/**
 * creation : 2016/06/29 13:52
 */
public class CommonDefenseEnemyData extends Enemy{

    private String fileName = "ecommondefense.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 32;
    private String movingType = "vertical";
    private int speed = 7;
    private int offense = 1;
    private int defence = 2;

    private Object[] commonAttackEnemyImageData
            = {fileName, numberLine, numberColumn, width, height,
            movingType, speed, offense, defence};

    public Object[] getCommonDefenseEnemyData(){
        return commonAttackEnemyImageData;
    }

}