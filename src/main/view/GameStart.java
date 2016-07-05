package main.view;

import main.model.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * TODO Documentation
 */
public class GameStart extends JFrame implements ActionListener {

    private BufferedImage gameLogo;
    private JButton startButton = new JButton("Start");
    private JButton highScoreButton = new JButton("High Score");

    private Game game;

    public GameStart(BufferedImage gameLogo, Game game) throws IOException, InterruptedException {

        setTitle("Infinite Fight");
        setSize(new Dimension(384, 480));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        this.gameLogo = gameLogo;
        this.game = game;

        // TODO Layout verwenden um Buttons zu positionieren
        // TODO Buttons personalisieren?
        startButton.setBounds(80,350,100,40);
        highScoreButton.setBounds(200,350,100,40);

        this.add(startButton);
        this.add(highScoreButton);
        startButton.addActionListener(this);
        highScoreButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(gameLogo, 0, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton){
            this.setVisible(false);
        }
        if (e.getSource() == highScoreButton){
            // TODO High Score
        }
    }
}