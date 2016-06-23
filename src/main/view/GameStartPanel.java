package main.view;

import main.model.enemy.Enemy;
import main.model.player.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by user on 21/06/2016.
 */
public class GameStartPanel extends JPanel  {
    /**
     * Background
     */
    private String file = ObjectData.getImageFiles().get(3)[0];
    private BufferedImage bgImage = ImageIO.read(new File(file));

    private int yPos = 0;
    private int yPosScroll = bgImage.getHeight();
    // button to begin the Game
    JButton startButton = new JButton("Start");
   // button to show the high Score
    JButton highScoreButton = new JButton("High Score");

    GameStartPanel() throws IOException {
        this.setLayout(null);
        this.startButton.setBounds(80,350,100,40);
        this.highScoreButton.setBounds(200,350,100,40);
        this.add(startButton);
        this.add(highScoreButton);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgImage, 0, yPos, null);
    }

}
