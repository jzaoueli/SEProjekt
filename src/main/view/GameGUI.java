package main.view;

/**
 * TODO Documentation
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.MemoryImageSource;
import java.io.IOException;

public class GameGUI extends JFrame {

    public GameGUI(GamePanel gamePanel) throws IOException, InterruptedException {

        setTitle("InfiniteFight");
        setSize(new Dimension(384, 480));
        setResizable(false);
        setLocationRelativeTo(null);

        this.add(gamePanel);
        gamePanel.setVisible(true);

        int[] pixels = new int[16 * 16];
        Image image = Toolkit.getDefaultToolkit().createImage(
                new MemoryImageSource(16, 16, pixels, 0, 16));
        Cursor transparentCursor =
                Toolkit.getDefaultToolkit().createCustomCursor
                        (image, new Point(0, 0), "invisibleCursor");
        this.setCursor(transparentCursor);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Runtime.getRuntime().exit(0);
            }
        });
    }
}