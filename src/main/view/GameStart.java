package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.MemoryImageSource;
import java.io.IOException;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

/**
 * Created by user on 21/06/2016.
 */
public class GameStart extends JFrame implements ActionListener {

    private GameStartPanel gameStartPanel = new GameStartPanel();

    public GameStartPanel getGameStartPanel() {
        return gameStartPanel;
    }

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

      /*  gameStartPanel.startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = null;
                try {
                    frame = new GUI();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

                frame.setVisible(true);
               // remove(gameStartPanel);
            }



        });
*/
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gameStartPanel.startButton){
            this.setVisible(false);
            this.setEnabled(false);
            this.remove(gameStartPanel);

            try {
                JFrame frame = new GUI();
                frame.setVisible(true);
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
