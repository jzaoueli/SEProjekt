package main.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 12/06/2016.
 */
public class Principal {
    private JButton playButton;
    private JButton pauseButton;
    private JButton leftButton;
    private JButton shootButton;
    private JButton rightButton;
    private JPanel Spielfeld;
    private JPanel panelMain;

    public Principal() {
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        shootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hallo World");
            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        JFrame frame = new JFrame("Spiel");
        frame.setPreferredSize(new Dimension( 774, 520));
        p.Spielfeld.setPreferredSize( new Dimension(768, 512));
        frame.setContentPane(p.panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
