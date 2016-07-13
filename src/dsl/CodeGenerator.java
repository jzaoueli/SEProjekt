package dsl;

import dsl.function.*;

import java.io.IOException;

/**
 * Generates ImageFiles.java
 * using CodeGeneratorFunction
 */
public class CodeGenerator {

    public static void main(String[] args) throws IOException {

        String srcFile = "src/dsl/srcjson.txt";

        //generateLogo
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();
        if (logoGeneratorFunction.run("main.generated.image", srcFile)) {
            System.out.println("- Logo class generated");
        } else {
            System.out.println("- Logo class not generated");
        }

        //generateBackGround
        BackGroundGeneratorFunction backGroundGeneratorFunction = new BackGroundGeneratorFunction("main.generated.image");
        backGroundGeneratorFunction.run(srcFile);

        //generatePlayer
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();
        if (playerGeneratorFunction.run("main.generated.image", srcFile)) {
            System.out.println("- Player class generated");
        } else {
            System.out.println("- Player class not generated");
        }

        //generateEnemy
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction("main.generated.enemy");
        enemyGeneratorFunction.run(srcFile);

        //generateBullet
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction("main.generated.bullet");
        bulletGeneratorFunction.run(srcFile);

        //item generation
        ItemGeneratorFunction itemGeneratorFunction = new ItemGeneratorFunction("main.generated.item");
        itemGeneratorFunction.run(srcFile);

    }
}
