package main.control;

import main.generated.bullet.BulletNormal;
import main.generated.enemy.*;
import main.generated.image.ImageBackground;
import main.generated.image.ImagePlayer;
import main.generated.item.WeakAttackItemData;
import main.model.Game;
import main.model.Player;
import main.view.GameGUI;
import main.view.GamePanel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * TODO Game Control
 * TODO Documentation
 */
public class MainManager {
    private static String imageDirectory = "images/";

    public static BufferedImage backgroundImage;
    public static Player player;

    public static ArrayList<Object[]> bulletClass;
    public static ArrayList<Object[]> enemyClass;
    public static ArrayList<Object[]> itemClass;

    public static void main(String[] args) throws IOException, InterruptedException {

        setUpImageObject();

        Game game = new Game(player, bulletClass, enemyClass, itemClass);
        GamePanel gamePanel = new GamePanel(backgroundImage, game);
        GameGUI gameGUI = new GameGUI(gamePanel);
        game.play(gameGUI);

    }

    private static void setUpImageObject() throws IOException {
        setBackGround();
        setPlayer();
        setBullet();
        setEnemy();
        setItem();
    }

    public static void setItem() {
        itemClass = new ArrayList<>();
        Object[] weakAttackItemObject = new WeakAttackItemData().getWeakAttackItemData();
        itemClass.add(weakAttackItemObject);
    }

    public static void setEnemy() {
        enemyClass = new ArrayList<>();
        Object[] commonAttackEnemyObject = new CommonAttackEnemyData().getCommonAttackEnemyData();
        enemyClass.add(commonAttackEnemyObject);

        Object[] commonDefenseEnemyObject = new CommonDefenseEnemyData().getCommonDefenseEnemyData();
        enemyClass.add(commonDefenseEnemyObject);

        Object[] uncommonAttackEnemyObject = new UncommonAttackEnemyData().getUncommonAttackEnemyData();
        enemyClass.add(uncommonAttackEnemyObject);

        Object[] uncommonDefenseEnemyObject = new UncommonDefenseEnemyData().getUncommonDefenseEnemyData();
        enemyClass.add(uncommonDefenseEnemyObject);

        Object[] rareAttackEnemyObject = new RareAttackEnemyData().getRareAttackEnemyData();
        enemyClass.add(rareAttackEnemyObject);

        Object[] rareDefenseEnemyData = new RareDefenseEnemyData().getRareDefenseEnemyData();
        enemyClass.add(rareDefenseEnemyData);
    }

    public static void setBullet() {
        bulletClass = new ArrayList<>();
        Object[] bulletObject = new BulletNormal().getBulletImage();
        bulletClass.add(bulletObject);
    }

    public static void setPlayer() throws IOException {
        Object[] playerObject = new ImagePlayer().getPlayerImage();
        player = new Player(playerObject);
    }

    public static void setBackGround() throws IOException {
        String backgroundImageFileName = new ImageBackground().getFileName();
        File backgroundImageFile = new File(imageDirectory + backgroundImageFileName);
        backgroundImage = ImageIO.read(backgroundImageFile);
    }

}
