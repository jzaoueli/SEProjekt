package test.dsl;

import dsl.antlr.function.*;
import org.junit.Before;
import org.junit.Test;
import test.support.base.TestBase;

import java.io.IOException;

import static test.support.utils.Strings.*;


/**
 * testing all used function in main class CodeGenerator class
 */

public class CodeGeneratorSpec extends TestBase {

    @Before
    public void setUp(){
        cleanOldGeneratedFiles();
    }

    @Test
    public void testLogoClassGeneration() {
        whenRunLogoGeneratorFunction();
        thenFileIsGenerated(LOGO_CLASS_FILE_NAME);
    }

    @Test
    public void testBackGroundClassGeneration() {
        whenRunBackGroundGeneratorFunction();
        thenFileIsGenerated(BACKGROUND_CLASS_FILE_NAME);
    }


    @Test
    public void testPlayerClassGeneration() {
        whenRunPlayerGeneratorFunction();
        thenFileIsGenerated(PLAYER_FILE_NAME);
    }


    @Test
    public void testEnemyClassGeneration() {
        whenRunEnemyGeneratorFunction();
        thenFileIsGenerated(ENEMY_CLASS_FILE_NAME);
    }


    @Test
    public void testBulletClassGeneration() {
        whenRunBulletGeneratorFunction();
        thenFileIsGenerated(BULLET_CLASS_FILE_NAME);
    }

    private void whenRunLogoGeneratorFunction() {
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();
        try {
            logoGeneratorFunction.run(TEST_FILE_PACKAGE_NAME, TEST_CSV_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunBackGroundGeneratorFunction() {
        BackGroundGeneratorFunction backGroundGeneratorFunction = new BackGroundGeneratorFunction();
        try {
            backGroundGeneratorFunction.run(TEST_FILE_PACKAGE_NAME, TEST_CSV_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunPlayerGeneratorFunction() {
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();
        try {
            playerGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,TEST_CSV_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void whenRunEnemyGeneratorFunction() {
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction();
        try {
            enemyGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,TEST_CSV_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void whenRunBulletGeneratorFunction() {
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction();
        try {
            bulletGeneratorFunction.run(TEST_FILE_PACKAGE_NAME,TEST_CSV_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}