package uitest;

import main.generated.enemy.CommonAttackEnemyData;
import main.model.Game;
import main.view.GameGUI;
import main.view.GamePanel;
import org.junit.Before;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static main.control.MainManager.*;
import static org.junit.Assert.assertTrue;

/**
 * Game Ui test
 * running the game and assert it stay running until to reach @DISTANCE_TO_TEST
 */
public class TestRunningGame {
    private static int DISTANCE_TO_TEST = 20;
    private static int PLAYER_LIFE_POINT = 2000;

    private static int RIGHT_BORDER = 320;
    private static int LEFT_BORDER = 32;

    @Before
    public void setUp() throws IOException {
        givenGameObjects();
    }

    @Test
    public void testRunMain() throws IOException, InterruptedException {
        whenStartGame();
        thenGUIRunning();

        while (gamePanel.distanceValue < DISTANCE_TO_TEST) {
            givenPlayerLifePoints(PLAYER_LIFE_POINT);
            givenMovePlayer("right");

            thenGUIRunning();

            givenMovePlayer("left");

            thenGUIRunning();
        }
    }

    private void setBackground() throws IOException {
        File backgroundImageFile = new File("src/test/assets/back.jpg");
        backgroundImage = ImageIO.read(backgroundImageFile);
    }

    private void whenStartGame() throws IOException, InterruptedException {
        game = new Game(player, bulletClass, enemyClass, itemClass);
        gamePanel = new GamePanel(backgroundImage, game);
        gameGUI = new GameGUI(gamePanel);
        game.play(gameGUI);
    }

    private void givenMovePlayer(String direction) throws InterruptedException {
        if (direction.equals("right")) {
            while (player.getX() < RIGHT_BORDER) {
                player.setMovement(direction);
                sleep(50);
            }
        }
        if (direction.equals("left")) {
            while (player.getX() > LEFT_BORDER) {
                player.setMovement(direction);
                sleep(50);
            }
        }
    }

    private void givenPlayerLifePoints(int lifePoints) {
        player.setLifePoints(lifePoints);
    }

    private void thenGUIRunning() {
        assertTrue(gameGUI.isEnabled());
    }

    private void givenGameObjects() throws IOException {
        setBackground();
        setPlayer();
        setBullet();
        setEnemy();
        setItem();
    }
}
