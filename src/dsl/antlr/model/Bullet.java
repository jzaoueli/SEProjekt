package dsl.antlr.model;

/**
 * creation : 2016/07/07 16:47
 */
public class Bullet {

    private String fileName;
    private int numberLine;
    private int numberColumn;
    private int width;
    private int height;
    private int attack;
    private int speed;

    /**
     * Constructor with parameters
     */
    public Bullet(String fileName, int numberLine, int numberColumn, int width, int height, int attack, int speed) {
        this.fileName = fileName;
        this.numberLine = numberLine;
        this.numberColumn = numberColumn;
        this.width = width;
        this.height = height;
        this.attack = attack;
        this.speed = speed;
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

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }
}