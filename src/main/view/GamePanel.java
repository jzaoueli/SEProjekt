package main.view;

import main.model.enemy.Enemy;
import main.model.player.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Realizes Backgrounds Vertical Scroll Movement
 * Holds and updates Players Image Frames
 * Realizes Players Horizontal Movement
 * TODO
 */

class GamePanel extends JPanel{

    /**
     * Background
     */
    private String file = ObjectData.getImageFiles().get(0)[0];
    private BufferedImage bgImage = ImageIO.read(new File(file));
    private BufferedImage bgImageOff = bgImage;
    private int yPos = 0;
    int yPosScroll = bgImage.getHeight();

    /**
     * Player
     */
    private String[] playerImageData = ObjectData.getImageFiles().get(ObjectData.imageData.indexOf(ObjectData.player));
    private FrameAnimation playerAnimation = new FrameAnimation(playerImageData, 6);
    private Player player = new Player(playerAnimation);
    private int playerXPos = (bgImage.getWidth() / 2) -8;
    private int playerYPos = bgImage.getHeight() - 80;
    boolean transitionLeft, transitionRight = false;

    /**
     * Enemy
     */

    ArrayList<Enemy> enemies = new ArrayList<>();


    Timer timer = new Timer(32, e -> {
        yPos++;
        yPosScroll = yPos - bgImage.getHeight();
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
        repaint();
    });

    GamePanel() throws IOException {
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(bgImage, 0, yPos, null);
        g.drawImage(bgImageOff, 0, yPosScroll, null);

        if (yPos == bgImage.getHeight()) {
            g.clearRect(0, bgImage.getHeight(), bgImage.getWidth(), bgImage.getHeight() * 2);
            yPos = 0;
            yPosScroll = bgImage.getHeight();
        }
        g.drawImage(player.playerAnimation.frame, playerXPos, playerYPos, null);
        repaint();
    }
}