package test.java.main;

import main.generated.Bullet;
import main.generated.Player;
import org.junit.Test;
import test.java.support.base.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static test.java.support.utils.Strings.TEST_JAVA_FILE_NAME;

/**
 * testing Bullet class
 */
public class BulletTest extends TestBase {

    private Bullet bullet;

    @Test
    public void testConstructor() {
        bullet = new Bullet();

        assertNotNull(bullet);

        assertNotNull(bullet.getFileName());
        assertNotNull(bullet.getNumberLine());
        assertNotNull(bullet.getNumberColumn());
        assertNotNull(bullet.getWidth());
        assertNotNull(bullet.getHeight());
    }

    @Test
    public void testParametrizedConstructor() {
        bullet = new Bullet(TEST_JAVA_FILE_NAME, 1, 2, 3, 4);

        assertNotNull(bullet);

        assertEquals(bullet.getFileName(), TEST_JAVA_FILE_NAME);
        assertEquals(bullet.getNumberLine(), 1);
        assertEquals(bullet.getNumberColumn(), 2);
        assertEquals(bullet.getWidth(), 3);
        assertEquals(bullet.getHeight(), 4);
    }
}
