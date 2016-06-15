package main.game.Player;

/**
 * Player class.
 */
public class PlayerControl {
    private static int level = 1;
    private int lifePoints;

    PlayerControl() {

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
