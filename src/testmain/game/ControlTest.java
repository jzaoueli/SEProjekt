package testmain.game;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * "just setup test"
 * TODO doc
 */
public class ControlTest {
    private int x = 1;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.out.println("x = " + x);
    }

    @Test
    public void testMain() throws Exception {
        String outString = outContent.toString();
        assertEquals("x = 1\r\n", outString);
    }

}