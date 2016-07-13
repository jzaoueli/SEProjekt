package test.java.dsl.model;

import dsl.antlr.model.Item;
import org.junit.Test;
import test.java.support.base.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static test.java.support.utils.Strings.TEST_JAVA_FILE_NAME;

/**
 * testing Item class
 */
public class ItemTest extends TestBase{
    private Item item;

    @Test
    public void testParametrizedConstructor(){
        item = new Item(null,TEST_JAVA_FILE_NAME,1,2,3,4,"My effect");

        assertNotNull(item);

        assertEquals(item.getFileName(),TEST_JAVA_FILE_NAME);
        assertEquals(item.getNumberLine(),1);
        assertEquals(item.getNumberColumn(),2);
        assertEquals(item.getWidth(),3);
        assertEquals(item.getHeight(),4);
        assertEquals(item.getEffect(),"My effect");

    }
}
