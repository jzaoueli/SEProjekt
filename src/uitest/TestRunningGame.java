package uitest;

import org.junit.Test;

import java.io.IOException;

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

    @Test
    public void testRunMain() throws IOException, InterruptedException {
        main(null);
        thenGUIRunning();

        while (gamePanel.distanceValue < DISTANCE_TO_TEST) {
            givenPlayerLifePoints(PLAYER_LIFE_POINT);
            givenMovePlayer("right");

            thenGUIRunning();

            givenMovePlayer("left");

            thenGUIRunning();
        }
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
}
