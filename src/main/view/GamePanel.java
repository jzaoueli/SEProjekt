package main.view;

import main.model.enemy.Enemy;
import main.model.player.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Realizes Backgrounds Vertical Scroll Movement
 * Holds and updates Players Image Frames
 * Realizes Players Horizontal Movement
 * TODO
 */
class GamePanel extends JPanel{

    /**
     * Background (wird in Control initializiert)
     */
    private String file = ObjectData.getImageFiles().get(0)[0];
    private BufferedImage bgImage = ImageIO.read(new File(file));
    private BufferedImage bgImageOff = bgImage;
    private int yPos = 0;
    private int yPosScroll = bgImage.getHeight();

    /**
     * Player (wird in Control initializiert)
     */
    private String[] playerImageData = ObjectData.getImageFiles().get(ObjectData.imageData.indexOf(ObjectData.player));
    private FrameAnimation playerAnimation = new FrameAnimation(playerImageData, 6);
    private Player player = new Player(playerAnimation);
    private int playerXPos = (bgImage.getWidth() / 2) -8;
    private int playerYPos = bgImage.getHeight() - 80;
    boolean transitionLeft, transitionRight = false;

    /**
     * Enemy (wird in Control initializiert)
     */
    private int random;
    private int enemyStartX;
    private int enemyIndex;
    private int distance = 0;
    private ArrayList<Enemy> aliveEnemy = new ArrayList<>();
    /**
     * Enemy creation speed
     */
    private int rate = 32;
    private String[] enemyImageData = ObjectData.getEnemyData().get(ObjectData.enemyData.indexOf(ObjectData.attack));
    private FrameAnimation enemyAnimation = new FrameAnimation(enemyImageData, 6);

    /**
     * Sets the Enemy creation rate
     * Creates Enemies
     */
    private Timer enemyTimer = new Timer(rate, e -> {
        /**
         * Random number between 1 and 16
         */
        random = (int) (Math.random() * 16) + 1;
        switch (random){
            case 1:
                enemyStartX = (int) (Math.random() * 288 + 32);
                aliveEnemy.add(new Enemy(1, enemyAnimation, enemyStartX));
        }
    });
    /**
     * GUI Timer
     */
    Timer timer = new Timer(32, e -> {
        /**
         * Animate Background seamlessly
         */
        yPos++;
        yPosScroll = yPos - bgImage.getHeight();
        /**
         * Animate Player
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
         * Animate Enemies
         * Move Enemies
         */
        for (Enemy enemy : aliveEnemy){
            enemy.enemyAnimation.animate();
            enemy.setMovement(1, 10);
            repaint();
        }
        /**
         * Delete Enemies
         */
        for (Iterator<Enemy> iterator = aliveEnemy.listIterator(); iterator.hasNext(); ) {
            Enemy enemy = iterator.next();
            if (enemy.getY() > 480) {
                iterator.remove();
            }
        }
        distance++;
        repaint();
    });

    GamePanel() throws IOException {
        timer.start();
        enemyTimer.start();
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
         * Draw Enemies
         */
        for (Enemy enemy : aliveEnemy){
            g.drawImage(enemy.enemyAnimation.frame, enemy.getX(), enemy.getY(), null);
        }
    }
}