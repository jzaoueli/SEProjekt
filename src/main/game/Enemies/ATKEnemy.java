package main.game.Enemies;

/**
 * Created by Yahima on 08.06.16.
 * ATKEnemy is the common Enemy.
 * No Drop, Common Speed, Common ATK, weak DEF.
 */
public class ATKEnemy implements Enemy {

    private int atk;
    private int def;
    private float speed;
    private int lvl;
    private int x, y;
    private String action;

    private EnemySprite sprite;


    ATKEnemy(EnemySprite sprite){
        this.atk = 3 * this.lvl;
        this.def = this.lvl;
        this.speed = 1;
    }

    @Override
    public void move() {
        action = "move";
        this.speed = 1;
        this.y += speed;
    }

    @Override
    public void bulletHit() {
        this.speed = 0;
        action = "bulletHit";
    }

    @Override
    public void hit() {
        this.speed = 0;
        action = "hit";
    }

    @Override
    public void die() {
        action = "die";
    }

    @Override
    public void updateAction(String action) {
    }
}
