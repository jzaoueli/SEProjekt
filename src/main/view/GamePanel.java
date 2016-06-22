package main.view;

import main.model.enemy.Enemy;
import main.model.player.Bullet;
import main.model.player.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Realizes Backgrounds Vertical Scroll Movement
 * Holds and updates Players Image Frames
 * Realizes Players Horizontal Movement
 * Creates Enemies
 * TODO MainManager
 */
class GamePanel extends JPanel{

    /**
     * Background (wird in Control initializiert)
     */
    private String file = ObjectData.getImageFiles().get(0)[0];
    private BufferedImage bgImage = ImageIO.read(new File(file));
    private BufferedImage bgImageOff = bgImage;
    private int yPos = 0;
    private int yPosScroll;

    /**
     * Player (wird in Control initializiert)
     */
    private String[] playerImageData = ObjectData.getImageFiles().get(ObjectData.imageData.indexOf(ObjectData.player));
    private FrameAnimation playerAnimation = new FrameAnimation(playerImageData, 6);
    private Player player = new Player(playerAnimation);
    private int playerXPos = (bgImage.getWidth() / 2) -8;
    private int playerYPos = bgImage.getHeight() - 80;
    public boolean transitionLeft = false;
    public boolean transitionRight = false;

    /**
     * Bullet
     */
    private int bulletStartX;
    private int bulletStartY = playerYPos;
    private ArrayList<Bullet> bullets = new ArrayList<>();
    private String[] bulletImageData = ObjectData.getImageFiles().get(ObjectData.imageData.indexOf(ObjectData.bullets));
    private FrameAnimation bulletAnimation = new FrameAnimation(bulletImageData, 6);
    /**
     * Enemy (wird in Control initializiert)
     */
    private int random;
    private int enemyStartX;
    private ArrayList<Enemy> aliveEnemy = new ArrayList<>();
    private String[] enemyImageData = ObjectData.getEnemyData().get(ObjectData.enemyData.indexOf(ObjectData.attack));
    private FrameAnimation enemyAnimation = new FrameAnimation(enemyImageData, 6);

    /**
     * Sets the Enemy creation rate
     * Creates Enemies
     */
    public Timer enemyTimer = new Timer(32, e -> {
        /**
         * Random number between 1 and 16
         */
        random = (int) (Math.random() * 20) + 1;
        switch (random){
            case 1:
                enemyStartX = (int) (Math.random() * 288 + 32);
                aliveEnemy.add(new Enemy(1, enemyAnimation, enemyStartX));
                break;
        }
        /**
         * Delete Enemies when offscreen
         */
        for (Iterator<Enemy> iterator = aliveEnemy.listIterator(); iterator.hasNext(); ) {
            Enemy enemy = iterator.next();
            if (enemy.getY() > 480) {
                iterator.remove();
            }
        }
    });

    /**
     * Bullet Timer
     */
    public Timer bulletTimer = new Timer(192, e -> {
        bulletStartX = playerXPos;
        bullets.add(new Bullet(1, bulletAnimation, bulletStartX, bulletStartY));
        /**
         * Delete Bullets when offscreen
         */
        for (Iterator<Bullet> iterator = bullets.listIterator(); iterator.hasNext(); ) {
            Bullet bullet = iterator.next();
            if (bullet.getY() < 0) {
                iterator.remove();
            }
        }
    });

    /**
     * GUI Timer
     */
    public Timer timer = new Timer(32, e -> {
        /**
         * Animate Background seamlessly
         */
        yPos++;
        yPosScroll = yPos - bgImage.getHeight();
        /**
         * Animate Player
         * Move
         */
        if(transitionRight){
            transitionLeft = false;
            if(playerXPos <= 320) {
                playerXPos += 4;
            }
            else {
                transitionRight = false;
            }
        }
        if(transitionLeft){
            transitionRight = false;
            if(playerXPos >= 32){
                playerXPos -= 4;
            }
            else {
                transitionLeft = false;
            }
        }
        player.playerAnimation.animate();
        /**
         * Animate Bullets
         * Move Bullets
         */
        for (Bullet bullet : bullets){
            bullet.setMovement(10);
            bullet.bulletAnimation.animate();
        }
        /**
         * Animate Enemies
         * Move Enemies
         */
        for (Enemy enemy : aliveEnemy){
            enemy.setMovement(1, 10);
            enemy.enemyAnimation.animate();
        }
    });

    GamePanel() throws IOException {
        timer.start();
        enemyTimer.start();
        bulletTimer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        /**
         * Draw Background seamlessly
         */
        g.drawImage(bgImage, 0, yPos, null);
        g.drawImage(bgImageOff, 0, yPosScroll, null);
        if (yPos == bgImage.getHeight()) {
            g.clearRect(0, bgImage.getHeight(), bgImage.getWidth(), bgImage.getHeight() * 2);
            yPos = 0;
            yPosScroll = bgImage.getHeight();
        }
        /**
         * Draw Player
         */
        g.drawImage(player.playerAnimation.frame, playerXPos, playerYPos, null);
        /**
         * Draw Bullets
         */
        for (Bullet bullet: bullets) {
            g.drawImage(bullet.bulletAnimation.frame, bullet.getX(), bullet.getY(), null);
        }
        /**
         * Draw Enemies
         */
        for (Enemy enemy : aliveEnemy){
            g.drawImage(enemy.enemyAnimation.frame, enemy.getX(), enemy.getY(), null);
        }
        repaint();
    }
}