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
        ObjectDataGeneratorFunction objectDataGeneratorFunction = new ObjectDataGeneratorFunction();
        objectDataGeneratorFunction.run(packageName);

        //generateLogo
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();
        logoGeneratorFunction.run(packageName);

        //generateBackGround
        BackGroundGeneratorFunction backGroundGeneratorFunction = new BackGroundGeneratorFunction();
        backGroundGeneratorFunction.run(packageName);

        //generatePlayer
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();
        playerGeneratorFunction.run(packageName);

        //generateEnemy
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction();
        enemyGeneratorFunction.run(packageName);

        //generateBullet
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction();
        bulletGeneratorFunction.run(packageName);
    }
}
