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
        String srcFile= "src/dsl/antlr/src.csv";

        ObjectDataGeneratorFunction objectDataGeneratorFunction = new ObjectDataGeneratorFunction();
        objectDataGeneratorFunction.run(packageName);

        //generateLogo
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();
        logoGeneratorFunction.run(packageName,srcFile);

        //generateBackGround
        BackGroundGeneratorFunction backGroundGeneratorFunction = new BackGroundGeneratorFunction();
        backGroundGeneratorFunction.run(packageName,srcFile);

        //generatePlayer
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();
        playerGeneratorFunction.run(packageName,srcFile);

        //generateEnemy
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction();
        enemyGeneratorFunction.run(packageName,srcFile);

        //generateBullet
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction();
        bulletGeneratorFunction.run(packageName,srcFile);
    }
}
