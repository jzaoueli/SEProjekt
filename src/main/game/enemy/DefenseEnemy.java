package main.game.enemy;

/**
 * DEFEnemy is the common Enemy.
 * No Drop, slow, Common DEF, weak ATK.
 */
public class DefenseEnemy implements Enemy {

    private int atk = 1;
    private int def = 3;
    private float speed = 1;
    private int x, y;
    EnemyFrame sprite;


    DefenseEnemy() {

    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    @Override
    public void move() {
        this.y += speed;
    }

    @Override
    public void bulletHit() {

    }

    @Override
    public void hit() {

    }

    @Override
    public void die() {

    }

    @Override
    public void updateAction(String action) {

    }
}
