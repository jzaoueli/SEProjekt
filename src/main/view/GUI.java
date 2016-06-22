package main.view;

/**
 * Main Game Interface
 * TODO
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.MemoryImageSource;
import java.io.IOException;

public class GUI extends JFrame implements KeyListener{

    private boolean gamePaused = false;
    private GamePanel gamePanel = new GamePanel();

    public GUI() throws IOException, InterruptedException {
        setTitle("InfiniteFight");
        setMinimumSize(new Dimension(384, 480));
        setMaximumSize(new Dimension(384, 480));
        setLocationRelativeTo(null);
        this.add(gamePanel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Runtime.getRuntime().exit(0);
            }
        });
        addKeyListener(this);
        int[] pixels = new int[16 * 16];
        Image image = Toolkit.getDefaultToolkit().createImage(
                new MemoryImageSource(16, 16, pixels, 0, 16));
        Cursor transparentCursor =
                Toolkit.getDefaultToolkit().createCustomCursor
                        (image, new Point(0, 0), "invisibleCursor");
        this.setCursor(transparentCursor);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No action
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // No action}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            if(!gamePaused){
                gamePanel.timer.stop();
                gamePanel.enemyTimer.stop();
                gamePanel.bulletTimer.stop();
                gamePaused = true;
            }
            else {
                gamePanel.timer.start();
                gamePanel.enemyTimer.start();
                gamePanel.bulletTimer.start();
                gamePaused = false;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            gamePanel.transitionRight = true;
            gamePanel.transitionLeft = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            gamePanel.transitionLeft = true;
            gamePanel.transitionRight = false;
        }
    }
}


