package todo.enemy;


import main.model.player.Player;

/**
 * common Enemy.
 */
public class AttackEnemy implements Enemy {

    private int atk;
    private int def;
    private int speed = 8;
    private int level ; Player.getLevel();
    private int x, y;
    private String action;

    AttackEnemy(EnemyAnimation animation) {
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
