package test.java.support.base;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static test.java.support.utils.Strings.TEST_FILE_PACKAGE_NAME;
import static test.java.support.utils.Strings.TEST_FILE_PACKAGE_PATH;

/**
 * base class for test contains shared method
 */
public abstract class TestBase {

    protected void cleanOldGeneratedFiles() {
        //to delete one file delete comment for (1) and (2)
        //(1) Path path = Paths.get(TEST_FILE_PACKAGE_NAME + fileName);
        try {
            FileUtils.cleanDirectory(new File(TEST_FILE_PACKAGE_PATH));
            //(2) Files.delete(path);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", TEST_FILE_PACKAGE_NAME);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", TEST_FILE_PACKAGE_NAME);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }
    }

    protected void thenFileIsGenerated(String fileName) {
        File file = new File(TEST_FILE_PACKAGE_PATH + "/" + fileName);
        assertTrue(file.exists());
        //assertFalse(file.exists());
    }

    protected void thenFileIsNotGenerated(String fileName){
        File file = new File(TEST_FILE_PACKAGE_PATH + "/" + fileName);
        assertFalse(file.exists());
    }
}
