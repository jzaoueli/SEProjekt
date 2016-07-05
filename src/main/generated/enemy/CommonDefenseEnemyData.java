package main.generated.enemy;

import main.model.Enemy;

/**
 * creation : 2016/06/29 13:52
 */
public class CommonDefenseEnemyData extends Enemy{

    private String fileName = "images/e_commondefense.png";
    private int numberLine = 3;
    private int numberColumn = 4;
    private int width = 32;
    private int height = 32;
    private String movingType = "vertical";
    private int speed = 7;
    private int offense = 1;
    private int defence = 2;
    private int probability = 2;

    private Object[] commonAttackEnemyImageData
            = {fileName, numberLine, numberColumn, width, height,
            movingType, speed, offense, defence, probability};

    public Object[] getCommonDefenseEnemyData(){
        return commonAttackEnemyImageData;
    }

    // TODO Klasse wird nur bis hier benutzt

    /**
     * Constructor without parameter
     */
    public CommonDefenseEnemyData() {
    }

    /**
     * Constructor with parameters
     */
    public CommonDefenseEnemyData(String fileName, int numberLine, int numberColumn, int width, int height, String movingType, int speed, int offense, int defence, int probability) {
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