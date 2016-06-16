package main.gui;

/**
 * Gui Class for Test
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class GUI extends JFrame implements KeyListener {

    private boolean gamePaused = false;
    private GamePanel gamePanel = new GamePanel();

    public GUI() throws IOException, InterruptedException {
        setTitle("InfiniteFight");
        setMinimumSize(new Dimension(384, 576));
        setMaximumSize(new Dimension(384, 576));
        setLocationRelativeTo(null);
        this.add(gamePanel);
        addKeyListener(this);

//        EnemiesPanel enemiesPanel = new EnemiesPanel(PlayerControl.getLevel());
//        this.add(enemiesPanel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

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
                gamePanel.bgTimer.stop();
                gamePaused = true;
            }
            else {
                gamePanel.bgTimer.start();
                gamePaused = false;
            }
        }
    }
}


