package test.java.support.utils;

/**
 * string class for test contains used strings
 */
public class Strings {

    public static String LOGO_CLASS_FILE_NAME = "ImageLogo.java";
    public static String BACKGROUND_CLASS_FILE_NAME = "ImageBackGround.java";
    public static String PLAYER_FILE_NAME = "ImagePlayer.java";
    public static String BULLET_CLASS_FILE_NAME = "BulletNormal.java";
    public static String ENEMY_CLASS_FILE_NAME = "Enemy.java";

    public static String TEST_JAVA_FILE_NAME = "TestFile.java";

    public static String TEST_FILE_PACKAGE_PATH = "src/test/java/support/files";
    public static String TEST_CSV_FILE_PATH = "src/test/assets/test.csv";
    public static String TEST_TXT_FILE_PATH = "src/test/assets/test.txt";
    public static String TEST_WRONG_DATA_CSV_FILE_PATH = "src/test/assets/wrongdata.csv";
    public static String TEST_WRONG_DATA_TXT_FILE_PATH = "src/test/assets/wrongdata.txt";

    public static String TEST_FILE_PACKAGE_NAME = "test.java.support.files";

    public static String EXPECTED_GET_METHOD =
            "    public returnType getFieldName() {\n" +
                    "        return fieldName;\n" +
                    "    }\n\n";

    public static String EXPECTED_CONSTRUCTOR =
            "    /**\n" +
                    "     * Constructor without parameter\n" +
                    "     */\n" +
                    "    public ClassName() {\n" +
                    "    }\n\n";

    public static String EXPECTED_LOGO_CLASS =
            "    private String fileName = \"logo.png\";\n" +
                    "\n" +
                    "    /**\n" +
                    "     * Constructor without parameter\n" +
                    "     */\n" +
                    "    public Logo() {\n" +
                    "    }\n" +
                    "\n" +
                    "    /**\n" +
                    "     * Constructor with parameters\n" +
                    "     */\n" +
                    "    public Logo(String fileName) {\n" +
                    "        this.fileName = fileName;\n" +
                    "    }\n" +
                    "\n" +
                    "    public String getFileName() {\n" +
                    "        return fileName;\n" +
                    "    }\n" +
                    "\n";
}
