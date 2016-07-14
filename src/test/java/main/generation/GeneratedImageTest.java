package test.java.main.generation;

import main.generated.image.ImageBackground;
import main.generated.image.ImageLogo;
import main.generated.image.ImagePlayer;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * test generated image classes
 * - ImageBackground.java
 * - ImageLogo.java
 * - ImagePlayer.java
 */
public class GeneratedImageTest {
    private ImagePlayer player;
    private ImageLogo imageLogo;
    private ImageBackground imageBackground;

    @Before
    public void setUp(){
        player = new ImagePlayer();
        imageLogo = new ImageLogo();
        imageBackground = new ImageBackground();
    }

    @Test
    public void testImageBackground() {
        assertNotNull(imageBackground);
        assertThat(imageBackground.getFileName(),anyOf(containsString(".png"), containsString(".jpg")));

    }

    @Test
    public void testImageLogo() {
        assertNotNull(imageLogo);
        assertThat(imageLogo.getFileName(), anyOf(containsString(".png"), containsString(".jpg")));
    }

    @Test
    public void testImagePlayer() {
        assertNotNull(player);
        Object[] playerObject = player.getPlayerImage();
        assertThat((String) playerObject[0], anyOf(containsString(".png"), containsString(".jpg")));
    }
}
