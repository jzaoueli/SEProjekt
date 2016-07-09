package dsl;

import dsl.antlr.function.*;

import java.io.IOException;

/**
 * Generates ImageFiles.java
 * using CodeGeneratorFunction
 */
public class CodeGenerator {

    public static void main(String[] args) throws IOException {

        String packageName = "main.generated";
        String srcFile= "src/dsl/antlr/srcjson.txt";

        /*
        //generateLogo
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();
        if (logoGeneratorFunction.run(packageName, srcFile)) {
            System.out.println("- Logo class generated");
        } else {
            System.out.println("- Logo class not generated");
        }

        //generateBackGround
        BackGroundGeneratorFunction backGroundGeneratorFunction = new BackGroundGeneratorFunction();
        if (backGroundGeneratorFunction.run(packageName, srcFile)) {
            System.out.println("- BackGround class generated");
        } else {
            System.out.println("- BackGround class not generated");
        }*/


        //generatePlayer
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();
        if (playerGeneratorFunction.run("main.generated.image", srcFile)) {
            System.out.println("- Player class generated");
        } else {
            System.out.println("- Player class not generated");
        }

        /*
        //generateEnemy
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction();
        if (enemyGeneratorFunction.run(packageName, srcFile)) {
            System.out.println("- Enemy class generated");
        } else {
            System.out.println("- Enemy class not generated");
        }

        //generateBullet
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction();
        if (bulletGeneratorFunction.run("main.generated.bullet", srcFile)) {
            System.out.println("- Bullet class generated");
        } else {
            System.out.println("- Bullet class not generated");
        }
        */
    }
}
