package main.view;
import java.util.ArrayList;

/**
 * This Class must be generated by CodeGenerator
 * Contains for each Game Object the read image file name, dimensions and data
 * TODO
 */
class ObjectData {

    public static ArrayList<String[]> imageData = new ArrayList<>();
    public static ArrayList<String[]> enemyData = new ArrayList<>();

    public static String[] bg = {"Sheets/bground.jpg"};
    public static String[] startBackGround = {"Sheets/gameTitel.jpg"};
    public static String[] player = {"Sheets/player.png", "3", "4", "32", "48"};
    public static String[] bullets = {"Sheets/bullets.png", "1", "4","12", "12"};
    public static String[] attack = {"Sheets/atk.png", "3", "4", "32", "32", "zigzag", "8", "2", "1", "0.5"};



    public static ArrayList<String[]> getImageFiles(){
        imageData.add(bg);
        imageData.add(player);
        imageData.add(bullets);
        imageData.add(startBackGround);
        return imageData;
    }
    public static ArrayList<String[]> getEnemyData(){
        enemyData.add(attack);
        return enemyData;
    }
}