package test.java.dsl.model;

import dsl.antlr.model.BackGround;
import org.junit.Test;
import test.java.support.base.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static test.java.support.utils.Strings.TEST_JAVA_FILE_NAME;

/**
 * testing BackGround class
 */
public class BackGroundTest extends TestBase {

    private BackGround backGround;

    @Test
    public void testParametrizedConstructor() {
        backGround = new BackGround(TEST_JAVA_FILE_NAME);

        assertNotNull(backGround);

        assertEquals(backGround.getFileName(), TEST_JAVA_FILE_NAME);
    }
}
