package main.game;

import main.gui.ImageFiles;

import java.util.ArrayList;

/**
 * Game class
 */
public class Game {
    private static ArrayList<String[]> imageFiles;

    /**
     * first initialisation of game
     */
    public static void play(){
        imageFiles = ImageFiles.getImageFiles();

    }
}
