package dsl.antlr.model;

import com.sun.istack.internal.Nullable;

import static java.util.Objects.isNull;


/**
 * creation : 2016/07/07 16:47
 */
public class Enemy {

    private String enemyName;
    private String fileName;
    private int numberLine;
    private int numberColumn;
    private int width;
    private int height;
    private String movingType;
    private int speed;
    private int offense;
    private int defence;

    /**
     * Constructor with parameters
     */
    public Enemy(@Nullable String enemyName, String fileName, int numberLine, int numberColumn, int width, int height, String movingType, int speed, int offense, int defence) {
        if(isNull(enemyName)){
            enemyName = "AutoName";
        }
        this.enemyName = enemyName;
        this.fileName = fileName;
        this.numberLine = numberLine;
        this.numberColumn = numberColumn;
        this.width = width;
        this.height = height;
        this.movingType = movingType;
        this.speed = speed;
        this.offense = offense;
        this.defence = defence;
    }

    public String getEnemyName(){
        return enemyName;
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


}