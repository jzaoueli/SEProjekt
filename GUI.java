package main.view;

/**
 * Main Game Interface
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.MemoryImageSource;
import java.io.IOException;

public class GUI extends JFrame implements KeyListener, MouseMotionListener {

    private boolean gamePaused = false;
    private GamePanel gamePanel = new GamePanel();

    public GUI() throws IOException, InterruptedException {
        setTitle("InfiniteFight");
        setMinimumSize(new Dimension(384, 576));
        setMaximumSize(new Dimension(384, 576));
        setLocationRelativeTo(null);
        this.add(gamePanel);

        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
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

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_SPACE){
            if(!gamePaused){
                gamePanel.timer.stop();
                gamePaused = true;
            }
            else {
                gamePanel.timer.start();
                gamePaused = false;
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        gamePanel.playerX = e.getX();
        gamePanel.playerY = e.getY();

        if(e.getY() < 400){

            gamePanel.playerY = 400;
        }
        if(e.getY() > 500) {

            gamePanel.playerY = 500;
        }
        if(e.getX() < 32){
            gamePanel.playerX = 32;
        }
        if(e.getX() > 352){
            gamePanel.playerX = 352;
        }
    }
}


