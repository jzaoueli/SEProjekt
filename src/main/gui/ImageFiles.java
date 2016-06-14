package main.gui;

import java.util.ArrayList;

/**
 * Created by Pi on 14.06.2016.
 * This Class must be generated by GraphicsCodeGenerator
 */
public class ImageFiles {
    private ArrayList<String[]> imageFiles;

    private String[] player = {"player.png", "512", "512", "96"};
    private String[] bullets = {"bullets.png", "128", "128", "32"};
    private String[] atk = {"atk.png", "512", "512", "96"};
    private String[] def = {"def.png", "512", "512", "96"};
    private String[] bg = {"bg.png", "128", "128", "128"};

    public ArrayList<String[]> getImageFiles(){
        imageFiles.add(player);
        imageFiles.add(bullets);
        imageFiles.add(atk);
        imageFiles.add(def);
        imageFiles.add(bg);

        return imageFiles;
    }
}
