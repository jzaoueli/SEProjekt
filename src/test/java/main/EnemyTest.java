package test.java.main;

import main.generated.Enemy;
import main.generated.Player;
import org.junit.Test;
import test.java.support.base.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static test.java.support.utils.Strings.TEST_JAVA_FILE_NAME;

/**
 * testing Enemy class
 */
public class EnemyTest extends TestBase{
    private Enemy enemy;

    @Test
    public void testConstructor(){
        enemy = new Enemy();

        assertNotNull(enemy);

        assertNotNull(enemy.getFileName());
        assertNotNull(enemy.getNumberLine());
        assertNotNull(enemy.getNumberColumn());
        assertNotNull(enemy.getWidth());
        assertNotNull(enemy.getHeight());
        assertNotNull(enemy.getMovingType());
        assertNotNull(enemy.getSpeed());
        assertNotNull(enemy.getOffense());
        assertNotNull(enemy.getDefence());
        assertNotNull(enemy.getProbability());
    }

    @Test
    public void testParametrizedConstructor(){
        enemy = new Enemy(TEST_JAVA_FILE_NAME,1,2,3,4,"vertical",5,6,7,8);

        assertNotNull(enemy);

        assertEquals(enemy.getFileName(),TEST_JAVA_FILE_NAME);
        assertEquals(enemy.getNumberLine(),1);
        assertEquals(enemy.getNumberColumn(),2);
        assertEquals(enemy.getWidth(),3);
        assertEquals(enemy.getHeight(),4);

        assertEquals(enemy.getMovingType(),"vertical");
        assertEquals(enemy.getSpeed(),5);
        assertEquals(enemy.getOffense(),6);
        assertEquals(enemy.getDefence(),7);
        assertEquals(enemy.getProbability(),8);

    }
}
