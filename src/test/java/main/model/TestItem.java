package test.java.main.model;

import main.generated.item.HealItemData;
import main.model.Item;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Testing Item model class
 */
public class TestItem {

    private Item item;

    @Test
    public void testConstructor() throws IOException {
        assertNull(item);

        whenCreateItem();
        assertNotNull(item);
        assertNotNull(item.getBoundingBox());

        whenSetUpPlayer(10);
        assertEquals(item.getX(),10);
    }

    private void whenSetUpPlayer(int positionX) {
        item.setX(positionX);
    }

    private void whenCreateItem() throws IOException {
        Object[] itemObject = new HealItemData().getHealItemData();
        item = new Item(itemObject,0,0);
    }
}