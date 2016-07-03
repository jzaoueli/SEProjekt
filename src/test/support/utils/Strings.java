package test.support.utils;

/**
 * string class for test contains used strings
 */
public class Strings {

    public static String LOGO_CLASS_FILE_NAME = "Logo.java";
    public static String BACKGROUND_CLASS_FILE_NAME = "BackGround.java";
    public static String PLAYER_FILE_NAME = "Player.java";
    public static String BULLET_CLASS_FILE_NAME = "Bullet.java";
    public static String ENEMY_CLASS_FILE_NAME = "Enemy.java";

    public static String TEST_JAVA_FILE_NAME = "TestFile.java";

    public static String TEST_FILE_PACKAGE_PATH = "src/test/support/files";
    public static String TEST_CSV_FILE_PATH = "src/test/support/utils/test.csv";

    public static String TEST_FILE_PACKAGE_NAME = "test.support.files";

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
