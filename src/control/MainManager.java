package control;

import view.GUI;

import javax.swing.*;
import java.io.IOException;

/**
 * Game Control
 */
public class MainManager {

    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame = new GUI();
        frame.setVisible(true);
    }
}
