package main.game;

import main.gui.GUI;

import javax.swing.*;
import java.io.IOException;

/**
 * Controller class
 * Game Control
 */
public class Control {

    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame = new GUI();
        frame.setVisible(true);
    }
}
