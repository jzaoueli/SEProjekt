package main.view;

import java.util.ArrayList;

/**
 * Contains for each Game Object the read image file name, dimensions and data
 * TODO GameImageGetter.getGameBackGround() instead of String[] background = {"Sheets/bground.jpg"}; to
 * TODO GameImageGetter.getGameStartLogo() instead of String[] startBackGround = {"Sheets/logogame.jpg"};
 * TODO GameImageGetter.getPlayerImages() instead of String[] player = {"Sheets/player.png", "3", "4", "32", "48"};
 * TODO GameImageGetter.getBulletImages() instead of String[] bullets = {"Sheets/bullets.png", "1", "4", "12", "12"};
 * TODO GameImageGetter.getEnemyImages() instead of String[] Enemy = {"Sheets/atk.png", "3", "4", "32", "32", "zigzag", "8", "2", "1", "0.5"};
 */
class ObjectData {

    public static ArrayList<String[]> imageData = new ArrayList<>();
    public static ArrayList<String[]> enemyData = new ArrayList<>();

    //TODO GameImageGetter gameImageGetter = new GameImageGetter();

    public static String[] bg = {"Sheets/bground.jpg"};
    public static String[] startBackGround = {"Sheets/logogame.jpg"};
    public static String[] player = {"Sheets/player.png", "3", "4", "32", "48"};

    public static String[] bullets = {"Sheets/bullets.png", "1", "4", "12", "12"};

    public static String[] Enemy = {"Sheets/atk.png", "3", "4", "32", "32", "zigzag", "8", "2", "1", "0.5"};

    public static ArrayList<String[]> getImageFiles() {
        imageData.add(bg);
        imageData.add(player);
        imageData.add(bullets);
        imageData.add(startBackGround);
        return imageData;
    }

    public static ArrayList<String[]> getEnemyData() {
        enemyData.add(Enemy);
        return enemyData;
    }
}