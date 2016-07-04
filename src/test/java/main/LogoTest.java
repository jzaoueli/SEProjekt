package test.java.main;

import main.generated.Logo;
import main.generated.Player;
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
    public void testConstructor(){
        logo = new Logo();

        assertNotNull(logo);
        assertNotNull(logo.getFileName());
    }

    @Test
    public void testParametrizedConstructor(){
        logo = new Logo(TEST_JAVA_FILE_NAME);

        assertNotNull(logo);
        assertEquals(logo.getFileName(),TEST_JAVA_FILE_NAME);
    }
}
