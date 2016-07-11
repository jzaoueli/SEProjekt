package main.view;

import main.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;


public class GamePanel extends JPanel implements KeyListener {

    public Player player;
    /**
     * The actual game
     */
    private Game game;
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
     * somme of frame shown, +1 in every repaint()
     */
    private int stateGame = 0;


    /**
     * display  SCORE, DISTANCE and BonusLives
     */
    private int scoreValue = 10;
    private int distanceValue = 0;
    private int bonusLivesValue = 4;

    private String Score = "SCORE : " + scoreValue;
    private String distance = "DISTANCE : " + distanceValue;
    private String bonusLives = "BONUS LIVES : " + bonusLivesValue;

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
        this.player.playerAnimation.animate();

        /**
         * Animate Bullets
         * Move Bullets
         */
        for (Bullet bullet : onScreenBullet) {
            bullet.setMovement();
            bullet.getBulletAnimation().animate();
        }

        /**
         * Animate Enemies
         * Move Enemies
         */
        for (Enemy enemy : aliveEnemy) {
            for (Bullet bullet : onScreenBullet) {
                if (bullet.getBoundingBox().intersects(enemy.getBoundingBox())) {
                    enemy.enemyAnimation.setActionFrames(1);
                    enemy.setDefense(enemy.getDefense() - bullet.getAttack());
                    if (enemy.getDefense() == 0) {
                        enemy.enemyAnimation.setActionFrames(2);
                        enemy.setState(2);
                        break;
                    }
                    bullet.setY(0);
                }
            }
            enemy.setMovement(enemy.movement);
            enemy.enemyAnimation.animate();
            enemy.enemyAnimation.setActionFrames(0);
        }
        repaint();
    });

    public GamePanel(BufferedImage backgroundImage, Game game) throws IOException {

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
        stateGame += 1;

        //make the game faster after
        if ((stateGame % 30) == 0) {
            distanceValue += 1;
            if ((distanceValue >= 100) && (distanceValue % 100) == 0 && game.enemyTimer.getDelay() > 100) {
                game.enemyTimer.setDelay(game.enemyTimer.getDelay() - 20);
                System.out.println("new Enemy Rate : " + game.enemyTimer.getDelay());
            }
            if ((distanceValue >= 300) && (distanceValue % 300) == 0 && guiTimer.getDelay() > 1) {
                guiTimer.setDelay(guiTimer.getDelay() - 1);
                System.out.println("new game animation speed : " + guiTimer.getDelay());
            }
        }

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

        /**
         * Draw Score , Distance  and Bonus lives
         */
        int fontSize = 14;
        g.setFont(new Font("Courier New", Font.BOLD, fontSize));
        g.setColor(Color.WHITE);
        g.drawString(Score, 33, 15);
        g.drawString("DISTANCE :" + distanceValue, 33, 35);
        g.drawString(bonusLives, 33, 55);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //movePlayer(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        movePlayer(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // movePlayer(e);
    }

    private void movePlayer(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (player.getX() <= backgroundImage.getWidth() - 64) {
                player.setX(player.getX() + 3);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (player.getX() >= 32) {
                player.setX(player.getX() - 3);
            }
        }
    }
}



