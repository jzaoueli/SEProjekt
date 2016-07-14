package test.java.main.generation;

import main.generated.enemy.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Testing generated enemy class
 */
public class GeneratedEnemyTest {

    private Object[] enemyObject;
    private CommonAttackEnemyData commonAttackEnemyData;
    private CommonDefenseEnemyData commonDefenseEnemyData;
    private RareAttackEnemyData rareAttackEnemyData;
    private RareDefenseEnemyData rareDefenseEnemyData;
    private UncommonAttackEnemyData uncommonAttackEnemyData;
    private UncommonDefenseEnemyData uncommonDefenseEnemyData;

    @Before
    public void setUp() {
        givenAllEnemyObjects();
    }

    @Test
    public void testCommonAttack() {
        assertNotNull(commonAttackEnemyData);
        enemyObject = commonAttackEnemyData.getCommonAttackEnemyData();
        assertEquals(enemyObject.length,9);
        assertThat((String) enemyObject[0], anyOf(containsString(".png"), containsString(".jpg")));
        assertTrue(enemyObject[5].equals("vertical") || enemyObject[5].equals("continue") || enemyObject[5].equals("zigzag"));
    }

    @Test
    public void testCommonDefense() {
        assertNotNull(commonDefenseEnemyData);
        enemyObject = commonDefenseEnemyData.getCommonDefenseEnemyData();
        assertEquals(enemyObject.length,9);
        assertThat((String) enemyObject[0], anyOf(containsString(".png"), containsString(".jpg")));
        assertTrue(enemyObject[5].equals("vertical") || enemyObject[5].equals("continue") || enemyObject[5].equals("zigzag"));
    }

    @Test
    public void testRareAttack() {
        assertNotNull(rareAttackEnemyData);
        enemyObject = rareAttackEnemyData.getRareAttackEnemyData();
        assertEquals(enemyObject.length,9);
        assertThat((String) enemyObject[0], anyOf(containsString(".png"), containsString(".jpg")));
        assertTrue(enemyObject[5].equals("vertical") || enemyObject[5].equals("continue") || enemyObject[5].equals("zigzag"));

    }

    @Test
    public void testRareDefense() {
        assertNotNull(rareDefenseEnemyData);
        enemyObject = rareDefenseEnemyData.getRareDefenseEnemyData();
        assertEquals(enemyObject.length,9);
        assertThat((String) enemyObject[0], anyOf(containsString(".png"), containsString(".jpg")));
        assertTrue(enemyObject[5].equals("vertical") || enemyObject[5].equals("continue") || enemyObject[5].equals("zigzag"));

    }

    @Test
    public void testUncommonAttack() {
        assertNotNull(uncommonAttackEnemyData);
        enemyObject = uncommonDefenseEnemyData.getUncommonDefenseEnemyData();
        assertEquals(enemyObject.length,9);
        assertThat((String) enemyObject[0], anyOf(containsString(".png"), containsString(".jpg")));
        assertTrue(enemyObject[5].equals("vertical") || enemyObject[5].equals("continue") || enemyObject[5].equals("zigzag"));

    }

    @Test
    public void testUncommonDefense() {
        assertNotNull(uncommonDefenseEnemyData);
        enemyObject = uncommonDefenseEnemyData.getUncommonDefenseEnemyData();
        assertEquals(enemyObject.length,9);
        assertThat((String) enemyObject[0], anyOf(containsString(".png"), containsString(".jpg")));
        assertTrue(enemyObject[5].equals("vertical") || enemyObject[5].equals("continue") || enemyObject[5].equals("zigzag"));

    }

    private void givenAllEnemyObjects() {
        commonAttackEnemyData = new CommonAttackEnemyData();
        commonDefenseEnemyData = new CommonDefenseEnemyData();
        rareAttackEnemyData = new RareAttackEnemyData();
        rareDefenseEnemyData = new RareDefenseEnemyData();
        uncommonAttackEnemyData = new UncommonAttackEnemyData();
        uncommonDefenseEnemyData = new UncommonDefenseEnemyData();
    }
}
