package test.java.dsl;

import dsl.function.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import test.java.support.base.TestBase;

import java.io.IOException;

import static test.java.support.utils.Strings.*;


/**
 * testing all used function in main class CodeGenerator class
 */

public class CodeGeneratorSpec extends TestBase {

    @Before
    public void setUp(){
        cleanOldGeneratedFiles();
    }

    @After
    public void cleanUp(){
        cleanOldGeneratedFiles();
    }

    @Test
    public void testLogoClassGeneration() {
        whenRunLogoGeneratorFunction(TEST_TXT_FILE_PATH);
        thenFileIsGenerated(LOGO_CLASS_FILE_NAME);
    }

    @Test
    public void testLogoClassGenerationWithWrongData(){
        whenRunLogoGeneratorFunction(TEST_WRONG_DATA_TXT_FILE_PATH);
        thenFileIsNotGenerated(LOGO_CLASS_FILE_NAME);
    }

    @Test
    public void testBackGroundClassGeneration() {
        whenRunBackGroundGeneratorFunction(TEST_TXT_FILE_PATH);
        thenFileIsGenerated(BACKGROUND_CLASS_FILE_NAME);
    }

    @Test
    public void testBackGroundClassGenerationWithWrongData(){
        whenRunBackGroundGeneratorFunction(TEST_WRONG_DATA_TXT_FILE_PATH);
        thenFileIsNotGenerated(BACKGROUND_CLASS_FILE_NAME);
    }


    @Test
    public void testPlayerClassGeneration() {
        whenRunPlayerGeneratorFunction(TEST_TXT_FILE_PATH);
        thenFileIsGenerated(PLAYER_FILE_NAME);
    }

    @Test
    public void testPlayerClassGenerationWithWrongData() {
        whenRunPlayerGeneratorFunction(TEST_WRONG_DATA_TXT_FILE_PATH);
        thenFileIsNotGenerated(PLAYER_FILE_NAME);
    }

    @Test
    public void testEnemyClassGeneration() {
        whenRunEnemyGeneratorFunction(TEST_TXT_FILE_PATH);
        thenFileIsGenerated(ENEMY_CLASS_FILE_NAME);
    }

    @Test
    public void testEnemyClassGenerationWithWrongData() {
        whenRunEnemyGeneratorFunction(TEST_WRONG_DATA_TXT_FILE_PATH);
        thenFileIsNotGenerated(ENEMY_CLASS_FILE_NAME);
    }

    @Test
    public void testBulletClassGeneration() {
        whenRunBulletGeneratorFunction(TEST_TXT_FILE_PATH);
        thenFileIsGenerated(BULLET_CLASS_FILE_NAME);
    }

    @Test
    public void testBulletClassGenerationWithWrongData() {
        whenRunBulletGeneratorFunction(TEST_WRONG_DATA_TXT_FILE_PATH);
        thenFileIsNotGenerated(BULLET_CLASS_FILE_NAME);
    }

    private void whenRunLogoGeneratorFunction(String srcFilePath) {
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();
        try {
            logoGeneratorFunction.run(TEST_FILE_PACKAGE_NAME, srcFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunBackGroundGeneratorFunction(String srcFilePath) {
        BackGroundGeneratorFunction backGroundGeneratorFunction = new BackGroundGeneratorFunction();
        try {
            backGroundGeneratorFunction.run(TEST_FILE_PACKAGE_NAME, srcFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunPlayerGeneratorFunction(String srcFilePath) {
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();
        try {
            playerGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,srcFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunEnemyGeneratorFunction(String srcFilePath) {
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction();
        try {
            enemyGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,srcFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void whenRunBulletGeneratorFunction(String srcFilePath) {
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction();
        try {
            bulletGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,srcFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}