package test.java.dsl;

import dsl.antlr.function.*;
import org.junit.After;
import org.junit.Before;
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
        whenRunLogoGeneratorFunction(TEST_CSV_FILE_PATH);
        thenFileIsGenerated(LOGO_CLASS_FILE_NAME);
    }

    @Test
    public void testLogoClassGenerationWithWrongCSVData(){
        whenRunLogoGeneratorFunction(TEST_WRONG_DATA_CSV_FILE_PATH);
        thenFileIsNotGenerated(LOGO_CLASS_FILE_NAME);
    }

    @Test
    public void testBackGroundClassGeneration() {
        whenRunBackGroundGeneratorFunction(TEST_CSV_FILE_PATH);
        thenFileIsGenerated(BACKGROUND_CLASS_FILE_NAME);
    }

    @Test
    public void testBackGroundClassGenerationWithWrongCSVData(){
        whenRunBackGroundGeneratorFunction(TEST_WRONG_DATA_CSV_FILE_PATH);
        thenFileIsNotGenerated(BACKGROUND_CLASS_FILE_NAME);
    }


    @Test
    public void testPlayerClassGeneration() {
        whenRunPlayerGeneratorFunction(TEST_CSV_FILE_PATH);
        thenFileIsGenerated(PLAYER_FILE_NAME);
    }

    @Test
    public void testPlayerClassGenerationWithWrongCSVData() {
        whenRunPlayerGeneratorFunction(TEST_WRONG_DATA_CSV_FILE_PATH);
        thenFileIsNotGenerated(PLAYER_FILE_NAME);
    }


    @Test
    public void testEnemyClassGeneration() {
        whenRunEnemyGeneratorFunction(TEST_CSV_FILE_PATH);
        thenFileIsGenerated(ENEMY_CLASS_FILE_NAME);
    }

    @Test
    public void testEnemyClassGenerationWithWrongCSVData() {
        whenRunEnemyGeneratorFunction(TEST_WRONG_DATA_CSV_FILE_PATH);
        thenFileIsNotGenerated(ENEMY_CLASS_FILE_NAME);
    }

    @Test
    public void testBulletClassGeneration() {
        whenRunBulletGeneratorFunction(TEST_CSV_FILE_PATH);
        thenFileIsGenerated(BULLET_CLASS_FILE_NAME);
    }

    @Test
    public void testBulletClassGenerationWithWrongCSVData() {
        whenRunBulletGeneratorFunction(TEST_WRONG_DATA_CSV_FILE_PATH);
        thenFileIsNotGenerated(BULLET_CLASS_FILE_NAME);
    }

    private void whenRunLogoGeneratorFunction(String csvPath) {
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();
        try {
            logoGeneratorFunction.run(TEST_FILE_PACKAGE_NAME, csvPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunBackGroundGeneratorFunction(String csvPath) {
        BackGroundGeneratorFunction backGroundGeneratorFunction = new BackGroundGeneratorFunction();
        try {
            backGroundGeneratorFunction.run(TEST_FILE_PACKAGE_NAME, csvPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunPlayerGeneratorFunction(String csvPath) {
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();
        try {
            playerGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,csvPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunEnemyGeneratorFunction(String csvPath) {
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction();
        try {
            enemyGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,csvPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void whenRunBulletGeneratorFunction(String csvPath) {
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction();
        try {
            bulletGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,csvPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}