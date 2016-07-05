package main.view;

import main.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


/**
 * Created by Pi on 04.07.2016.
 */
public class GamePanel extends JPanel implements KeyListener {

    /**
     * The actual game
     */
    private Game game;
    public Player player;
    private ArrayList<Bullet> onScreenBullet;
    private ArrayList<Enemy> aliveEnemy;
    private ArrayList<Item> leftItem;
    /**
     * BACKGROUND
     * Background Image
     */
    private BufferedImage backgroundImage;
    /**
     * Background Image Copy for seamless Scrolling
     */
    private BufferedImage backgroundImageOff;
    /**
     * Background Image Y Position
     */
    private int backgroundY;
    /**
     * Background Image Copy Y Position
     */
    private int backgroundOffY;
    /**
     * true if Player is moving in that direction
     */
    private boolean playerLeft = false;
    private boolean playerRight = false;
    /**
     * GUI Timer
     * Animates Objects on Screen
     */
    private Timer guiTimer = new Timer(32, e -> {
        /**
         * Animate Background seamlessly
         */
        backgroundY++;
        backgroundOffY = backgroundY - backgroundImage.getHeight();
        if (backgroundY == backgroundImage.getHeight()) {
            backgroundY = 0;
        }

        /**
         * Animate Player
         * Move
         */
        if (playerRight) {
            playerLeft = false;
            if (player.getX() <= backgroundImage.getWidth() - 64) {
                player.setX(player.getX() + 3);
            } else {
                playerRight = false;
            }
        }
        if (playerLeft) {
            playerRight = false;
            if (player.getX() >= 32) {
                player.setX(player.getX() - 3);
            } else {
                playerLeft = false;
            }
        }
        this.player.playerAnimation.animate();

        /**
         * Animate Bullets
         * Move Bullets
         */
        for (Bullet bullet : onScreenBullet) {
            bullet.setMovement();
            bullet.bulletAnimation.animate();
        }

        /**
         * Animate Enemies
         * Move Enemies
         */
        for (Enemy enemy : aliveEnemy) {
            for(Bullet bullet : onScreenBullet){
                if(bullet.getBoundingBox().intersects(enemy.getBoundingBox())){
                    enemy.setDefense(enemy.getDefense() - bullet.getAttack());
                    bullet.setY(0);
                }
            }
            enemy.setMovement(enemy.movement);
            enemy.enemyAnimation.animate();
        }
        repaint();
    });

    public GamePanel(BufferedImage backgroundImage, Game game) {

        this.backgroundImage = backgroundImage;
        this.backgroundImageOff = backgroundImage;
        this.backgroundY = 0;

        this.game = game;

        this.onScreenBullet = this.game.onScreenBullet;
        this.aliveEnemy = this.game.aliveEnemy;
        this.leftItem = this.game.leftItem;
        this.player = this.game.player;

        this.guiTimer.start();

        this.setFocusable(true);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        /**
         * Draw Background seamlessly
         */
        g.drawImage(backgroundImage, 0, backgroundY, null);
        g.drawImage(backgroundImageOff, 0, backgroundOffY, null);
        /**
         * Draw Player
         */
        g.drawImage(this.player.playerAnimation.frame, player.getX(), player.getY(), null);
        /**
         * Draw Bullets
         */
        for (Bullet bullet : onScreenBullet) {
            g.drawImage(bullet.bulletAnimation.frame, bullet.getX(), bullet.getY(), null);
        }
        /**
         * Draw Enemies
         */
        for (Enemy enemy : aliveEnemy) {
            g.drawImage(enemy.enemyAnimation.frame, enemy.getX(), enemy.getY(), null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No action
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // No action}
    }

    @Override
    public void keyReleased(KeyEvent e) {
/*        if (e.getKeyCode() == KeyEvent.VK_SPACE) {


        }
*/
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            playerRight = true;
            playerLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            playerLeft = true;
            playerRight = false;
        }
    }
}



