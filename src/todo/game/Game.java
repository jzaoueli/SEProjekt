package todo.game;

import main.view.ImageFiles;

import java.util.ArrayList;

/**
 * TODO Game class
 */
public class Game {
    private static ArrayList<String[]> imageFiles;

    public static void play(){
        imageFiles = ImageFiles.getImageFiles();

    }
}
