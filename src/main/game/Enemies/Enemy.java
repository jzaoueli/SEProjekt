package main.game.Enemies;

/**
 * Created by Yahima on 08.06.16.
 * Enemy Interface
 */
interface Enemy {

    /**Sets Movement of Enemy*/
    void move();
    /**Collision of Bullet with Enemy*/
    void bulletHit();
    /**Collision of Enemy with Player*/
    void hit();
    /**Enemy dies*/
    void die();
    /**Sets current Action*/
    void updateAction(String action);
}
