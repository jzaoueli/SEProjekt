package main.game.Enemies;

import main.game.Frame;
import main.game.Player;

import javax.swing.*;

/**
 * Created by Yahima on 08.06.16.
 * ATKEnemy is the common Enemy.
 *
 */
public class ATKEnemy implements Enemy {

    private int atk;
    private int def;
    private int speed = 8;
    private int level = Player.getLevel();
    private int x, y;
    private String action;

    ATKEnemy(EnemyAnimation animation){
        this.action = "move";
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
        this.action = action;
    }
}
