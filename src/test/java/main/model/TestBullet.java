package test.java.main.model;

import main.generated.bullet.BulletNormal;
import main.model.Bullet;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Testing Bullet model class
 */
public class TestBullet {

    private Bullet bullet;
    private Object[] bulletObject;

    @Before
    public void setUp() {
        givenBulletObject();
    }

    @Test
    public void testConstructor() throws IOException {
        assertNull(bullet);

        whenCreateItem();
        assertNotNull(bullet);
        assertNull(bullet.getBoundingBox());

        whenSetUpPlayer(10);
        assertEquals(bullet.getY(), 10);
        assertNotNull(bullet.getBoundingBox());
    }

    private void whenSetUpPlayer(int positionY) {
        bullet.setMovement();
        bullet.setY(positionY);
    }

    private void whenCreateItem() throws IOException {
        bullet = new Bullet(bulletObject, 0, 0);
    }

    private void givenBulletObject() {
        bulletObject = new BulletNormal().getBulletImage();
    }

}