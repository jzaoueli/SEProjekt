package test.java.dsl.model;

import dsl.antlr.model.Logo;
import org.junit.Test;
import test.java.support.base.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static test.java.support.utils.Strings.TEST_JAVA_FILE_NAME;

/**
 * testing Logo class
 */
public class LogoTest extends TestBase{
    private Logo logo;

    @Test
    public void testParametrizedConstructor(){
        logo = new Logo(TEST_JAVA_FILE_NAME);

        assertNotNull(logo);
        assertEquals(logo.getFileName(),TEST_JAVA_FILE_NAME);
    }
}
