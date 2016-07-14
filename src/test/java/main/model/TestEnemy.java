package test.java.main.model;

import main.generated.enemy.CommonAttackEnemyData;
import main.model.Enemy;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Testing Enemy model class
 */
public class TestEnemy {

    private Enemy enemy;
    private Object[] enemyObject;

    @Before
    public void setUp() {
        givenEnemyObject();
    }

    @Test
    public void testConstructor() throws IOException {
        assertNull(enemy);

        whenCreateItem();
        assertNotNull(enemy);
        assertNotNull(enemy.getBoundingBox());

        whenSetUpPlayer("continue",10,2);
        assertEquals(enemy.getAttack(), 10);
        assertEquals(enemy.getSpeed(),2);
    }

    private void whenSetUpPlayer(String movement, int attack, int speed) {
        enemy.setMovement(movement);
        enemy.setAttack(attack);
        enemy.setSpeed(speed);
    }

    private void whenCreateItem() throws IOException {
        enemy = new Enemy(enemyObject, 0);
    }

    private void givenEnemyObject() {
        enemyObject = new CommonAttackEnemyData().getCommonAttackEnemyData();
    }


}