package main.game.enemy;

/**
 * Enemy Interface
 */
interface Enemy {

    /**
     * Sets Movement of Enemy
     */
    void move();

    /**
     * Collision of Bullet with Enemy
     */
    void bulletHit();

    /**
     * Collision of Enemy with player
     */
    void hit();

    /**
     * Enemy dies
     */
    void die();

    /**
     * Sets current Action
     */
    void updateAction(String action);
}
