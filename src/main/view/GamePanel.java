package main.view;

import main.model.player.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Realizes Background an its Horizontal Scroll Movement
 * Holds Player Image Frames
 * TODO
 */

class GamePanel extends JPanel{

    private String file = ImageData.getImageFiles().get(1)[0];

    private BufferedImage bgImage = ImageIO.read(new File(file));
    private BufferedImage bgImageOff = bgImage;
    private int yPos = 0;
    private int yPosScroll = bgImage.getHeight();

    private String[] playerImageData = ImageData.getImageFiles().get(ImageData.imageData.indexOf(ImageData.player));
    private FrameAnimation playerAnimation = new FrameAnimation(playerImageData, 6);
    private Player player = new Player(playerAnimation);
    private int playerXPos = (bgImage.getWidth() / 2) -8;
    private int playerYPos = bgImage.getHeight() - 80;

    boolean transitionLeft, transitionRight = false;

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
        player.frameAnimation.animate();
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
        g.drawImage(player.frameAnimation.frame, playerXPos, playerYPos, null);
        repaint();
    }
}