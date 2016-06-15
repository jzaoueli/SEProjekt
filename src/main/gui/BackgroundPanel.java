package main.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * realizes Background an its Horizontal Scroll Movement
 */
class BackgroundPanel extends JPanel {

    private String file = ImageFiles.getImageFiles().get(4)[0];

    private BufferedImage bgImage = ImageIO.read(new File(file));
    private BufferedImage bgImageOff = bgImage;

    private int yPos = 0;
    private int yPosScroll = bgImage.getHeight();

    private Timer bgTimer = new Timer(32, e -> {
        yPos++;
        yPosScroll = yPos - bgImage.getHeight();
        repaint();
    });


    BackgroundPanel() throws IOException, InterruptedException {
        bgTimer.start();
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
    }
}
