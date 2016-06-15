package main.game;

/**
 * Player class.
 */
public class Player {
    private static int level = 1;
    private int lifePoints;

    Player() {

    }

    public void levelUp(){
        level++;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public static int getLevel() {
        return level;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
    }
}
