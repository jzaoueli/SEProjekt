package test.java.dsl.model;

import dsl.antlr.model.Player;
import org.junit.Test;
import test.java.support.base.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static test.java.support.utils.Strings.TEST_JAVA_FILE_NAME;

/**
 * testing player class
 */
public class PlayerTest extends TestBase{
    private Player player;

    @Test
    public void testParametrizedConstructor(){
        player = new Player(TEST_JAVA_FILE_NAME,1,2,3,4);

        assertNotNull(player);

        assertEquals(player.getFileName(),TEST_JAVA_FILE_NAME);
        assertEquals(player.getNumberLine(),1);
        assertEquals(player.getNumberColumn(),2);
        assertEquals(player.getWidth(),3);
        assertEquals(player.getHeight(),4);
    }
}
