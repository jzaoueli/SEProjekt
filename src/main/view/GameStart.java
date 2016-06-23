package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

/**
 * Created by user on 21/06/2016.
 */
public class GameStart extends JFrame implements ActionListener {
    private GameStartPanel gameStartPanel = new GameStartPanel();
    private JFrame frame = new GUI();
    public GameStart() throws IOException, InterruptedException {
        setTitle("InfiniteFight");
        setMinimumSize(new Dimension(384, 480));
        setMaximumSize(new Dimension(384, 480));
        setLocationRelativeTo(null);
        gameStartPanel.startButton.addActionListener(this);
        this.add(gameStartPanel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gameStartPanel.startButton){
            this.setVisible(false);
            this.add(frame);
        }
    }
}
