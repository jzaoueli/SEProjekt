package main.control;

import main.view.GUI;
import main.view.GameStart;
import javax.swing.*;
import java.io.IOException;

/**
 * Game Control
 * TODO
 */
public class MainManager {
    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame2 = new GameStart();
//        JFrame frame = new GUI();
//        frame.setVisible(true);
        frame2.setVisible(true);
    }

}
