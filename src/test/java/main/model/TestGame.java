package test.java.main.model;

import main.generated.bullet.BulletNormal;
import main.generated.enemy.CommonAttackEnemyData;
import main.generated.enemy.CommonDefenseEnemyData;
import main.generated.image.ImagePlayer;
import main.generated.item.BulletRateItemData;
import main.generated.item.HealItemData;
import main.model.Game;
import main.model.Player;
import main.view.GameGUI;
import main.view.GamePanel;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static main.control.MainManager.backgroundImage;
import static main.control.MainManager.gameGUI;
import static main.control.MainManager.gamePanel;
import static org.junit.Assert.*;

/**
 * Testing Game model class
 */
public class TestGame {

    private Game game;

    private Player player;

    private Object[] playerObject;
    private static ArrayList<Object[]> bulletClass;
    private static ArrayList<Object[]> enemyClass;
    private static ArrayList<Object[]> itemClass;

    @Before
    public void setUp() throws IOException {
        givenGameObjects();
    }

    @Test
    public void testRunningGame() throws IOException, InterruptedException {
        assertNull(game);

        whenCreateGame();
        thenGameNotRunning();

        GameGUI gameGUI = givenGameGUI();

        whenCallPlay(gameGUI);
        thenGameRunning();

        whenStopTimers();
        thenGameNotRunning();
    }

    private void thenGameRunning() {
        assertTrue(game.enemyTimer.isRunning());
        assertTrue(game.shootTimer.isRunning());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void thenGameNotRunning() {
        assertFalse(game.enemyTimer.isRunning());
        assertFalse(game.shootTimer.isRunning());
    }

    private void whenStopTimers() {
        game.enemyTimer.stop();
        game.shootTimer.stop();
    }

    private GameGUI givenGameGUI() throws IOException, InterruptedException {
        Game game = new Game(player, bulletClass, enemyClass, itemClass);
        setBackGround();
        GamePanel gamePanel = new GamePanel(backgroundImage, game);
        return new GameGUI(gamePanel);
    }

    private void setBackGround() throws IOException {
        File backgroundImageFile = new File("src/test/assets/back.jpg");
        backgroundImage = ImageIO.read(backgroundImageFile);
    }

    private void whenCallPlay(GameGUI gameGUI) {
        game.play(gameGUI);
    }


    private void whenCreateGame() throws IOException, InterruptedException {
        game = new Game(player, bulletClass, enemyClass, itemClass);
    }

    private void givenGameObjects() throws IOException {
        //set up player
        playerObject = new ImagePlayer().getPlayerImage();
        player = new Player(playerObject);

        //set up bullet list
        bulletClass = new ArrayList<>();
        Object[] bulletObject = new BulletNormal().getBulletImage();
        bulletClass.add(bulletObject);

        //set up enemy list
        enemyClass = new ArrayList<>();
        Object[] commonAttackEnemyObject = new CommonAttackEnemyData().getCommonAttackEnemyData();
        Object[] commonDefenseEnemyObject = new CommonDefenseEnemyData().getCommonDefenseEnemyData();
        enemyClass.add(commonAttackEnemyObject);
        enemyClass.add(commonDefenseEnemyObject);

        //set up item list
        itemClass = new ArrayList<>();
        Object[] healItemObject = new HealItemData().getHealItemData();
        Object[] bulletRateItemObject = new BulletRateItemData().getBulletRateItemData();
        itemClass.add(healItemObject);
        itemClass.add(bulletRateItemObject);
    }


}