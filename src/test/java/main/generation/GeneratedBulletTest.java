package test.java.main.generation;

import main.generated.bullet.BulletNormal;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * testing bullet generated class
 */
public class GeneratedBulletTest {

    private BulletNormal bullet;
    private Object[] bulletObject;

    @Before
    public void setUp() {
        bullet = new BulletNormal();
    }

    @Test
    public void testBulletNormal() {
        assertNotNull(bullet);
        bulletObject = bullet.getBulletImage();
        assertThat((String) bulletObject[0], CoreMatchers.containsString(".png"));
    }

}