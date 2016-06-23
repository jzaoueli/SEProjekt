package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.MemoryImageSource;
import java.io.IOException;

/**
 * Created by user on 21/06/2016.
 */
public class GameStart extends JFrame {

    private GameStartPanel gameStartPanel = new GameStartPanel();

    public GameStart() throws IOException, InterruptedException {
        setTitle("InfiniteFight");
        setMinimumSize(new Dimension(384, 480));
        setMaximumSize(new Dimension(384, 480));
        setLocationRelativeTo(null);

        this.add(gameStartPanel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        gameStartPanel.startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"Start");
            }
        });

        gameStartPanel.highScoreButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"High Score");
            }
        });

    }



}
