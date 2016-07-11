package test.java.main;

import org.junit.Test;
import test.java.support.base.TestBase;

import java.io.IOException;

import static main.control.MainManager.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * testing functionality of MainManager
 */
public class MainManagerTest extends TestBase {

    @Test
    public void testSetUpBackground() throws IOException {
        assertNull(backgroundImage);
        setBackGround();
        assertNotNull(backgroundImage);
    }

    @Test
    public void testSetUpPlayer() throws IOException {
        assertNull(player);
        setPlayer();
        assertNotNull(player);
    }

    @Test
    public void testSetUpBullet() {
        assertNull(bulletClass);
        setBullet();
        assertNotNull(bulletClass);
    }

    @Test
    public void testSetUpEnemy() {
        assertNull(enemyClass);
        setEnemy();
        assertNotNull(enemyClass);
    }

    @Test
    public void testSetUpItem() {
        assertNull(itemClass);
        setItem();
        assertNotNull(itemClass);
    }

}