package test.java.dsl;

import dsl.CodeGeneratorFunction;
import org.junit.Before;
import org.junit.Test;
import test.java.support.base.TestBase;

import java.io.IOException;

import static dsl.CodeGeneratorFunction.getGetter;
import static org.junit.Assert.assertEquals;
import static test.java.support.utils.Strings.*;


/**
 * testing different functions of codeGeneratorFunction
 */

public class CodeGeneratorFunctionSpec extends TestBase {

    private CodeGeneratorFunction codeGeneratorFunction;

    @Before
    public void setUp() {
        cleanOldGeneratedFiles();
        codeGeneratorFunction = new CodeGeneratorFunction("test.java.support.files", "TestFile");
    }

    @Test
    public void FileShouldBeCreated() throws Exception {
        whenGenerateFile();
        thenFileIsGenerated(TEST_JAVA_FILE_NAME);
    }

    private void whenGenerateFile() throws IOException {
        codeGeneratorFunction.setHeader(null,null);
        codeGeneratorFunction.setContent("");
        codeGeneratorFunction.setFooter();
        codeGeneratorFunction.createAndWriteInFile();
    }


}