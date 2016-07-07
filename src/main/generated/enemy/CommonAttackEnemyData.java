package main.generated.enemy;

import main.model.Enemy;

/**
 * creation : 2016/06/29 13:52
 */
public class CommonAttackEnemyData extends Enemy{

    private String fileName = "e_commonattack.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 32;
    private String movingType = "vertical";
    private int speed = 8;
    private int offense = 2;
    private int defence = 1;
    private int probability = 2;

    private Object[] commonAttackEnemyImageData
            = {fileName, numberLine, numberColumn, width, height,
            movingType, speed, offense, defence, probability};

    public Object[] getCommonAttackEnemyData(){
        return commonAttackEnemyImageData;
    }

    // TODO Klasse wird nur bis hier benutzt

    /**
     * Constructor without parameter
     */
    public CommonAttackEnemyData() {
    }

    /**
     * Constructor with parameters
     */
    public CommonAttackEnemyData(String fileName, int numberLine, int numberColumn, int width, int height, String movingType, int speed, int offense, int defence, int probability) {
        this.fileName = fileName;
        this.numberLine = numberLine;
        this.numberColumn = numberColumn;
        this.width = width;
        this.height = height;
        this.movingType = movingType;
        this.speed = speed;
        this.offense = offense;
        this.defence = defence;
        this.probability = probability;
    }

    public String getFileName() {
        return fileName;
    }

    public int getNumberLine() {
        return numberLine;
    }

    public int getNumberColumn() {
        return numberColumn;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMovingType() {
        return movingType;
    }

    public int getSpeed() {
        return speed;
    }

    public int getOffense() {
        return offense;
    }

    public int getDefence() {
        return defence;
    }

    public int getProbability() {
        return probability;
    }


}