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
 */

class GamePanel extends JPanel{

    private String file = ImageData.getImageFiles().get(1)[0];

    private BufferedImage bgImage = ImageIO.read(new File(file));
    private BufferedImage bgImageOff = bgImage;

    private int yPos = 0;
    private int yPosScroll = bgImage.getHeight();

    int playerX, playerY;

    private String[] playerImageData = ImageData.getImageFiles().get(ImageData.imageData.indexOf(ImageData.player));
    private FrameAnimation playerAnimation = new FrameAnimation(playerImageData, 6);
    Player player = new Player(playerAnimation);


    Timer timer = new Timer(32, e -> {
        yPos++;
        yPosScroll = yPos - bgImage.getHeight();
        playerAnimation.animate();
        repaint();
    });


    GamePanel() throws IOException, InterruptedException {
        timer.start();
        this.setVisible(true);
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
        g.drawImage(playerAnimation.frame, playerX -32, playerY, null);
    }
}
