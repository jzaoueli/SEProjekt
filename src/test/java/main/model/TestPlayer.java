package test.java.main.model;

import main.generated.image.ImagePlayer;
import main.model.Player;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Testing Player model class
 */
public class TestPlayer {
    private Player player;

    @Test
    public void testConstructor() throws IOException {
        assertNull(player);
        whenCreatePlayer();
        assertNotNull(player);
        assertNotNull(player.getBoundingBox());

        whenSetUpPlayer(500,10);

        assertEquals(player.getLifePoints(),500);
        assertEquals(player.getX(),10);
    }

    private void whenSetUpPlayer(int lifePoints, int positionX) {
        player.setLifePoints(lifePoints);
        player.setX(positionX);
    }

    private void whenCreatePlayer() throws IOException {
        Object[] playerObject = new ImagePlayer().getPlayerImage();
        player = new Player(playerObject);
    }


}