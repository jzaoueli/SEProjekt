package main.gui;

/**
 * Gui class
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class GUI extends JFrame {

    public GUI() throws IOException, InterruptedException {
        setTitle("InfiniteFight");
        setMinimumSize(new Dimension(384, 576));
        setMaximumSize(new Dimension(384, 576));
        setLocationRelativeTo(null);
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        } );

        setVisible(true);
    }

    public void update(Graphics g){
        repaint();
    }
}

