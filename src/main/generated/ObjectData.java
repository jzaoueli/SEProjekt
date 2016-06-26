package main.generated;

import java.util.ArrayList;

/**
 * creation : 2016/06/26 18:53
 */
public class ObjectData {

    static ArrayList<String[]> imageData = new ArrayList<>();
    static String[] player = {"Sheets/player.png", "3", "4", "32", "48"};
    private static String[] backGround = {"Sheets/bground.jpg"};

    static ArrayList<String[]> getImageFiles(){
        imageData.add(player);
        imageData.add(backGround);

        return imageData;
    }

}