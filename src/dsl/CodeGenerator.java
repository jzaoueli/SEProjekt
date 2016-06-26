package dsl;

import dsl.antlr.function.*;

import java.io.IOException;

/**
 * Generates ImageFiles.java
 * using CodeGeneratorFunction
 */
public class CodeGenerator {

    public static void main(String[] args) throws IOException {

        String objectDataPackage = "dsl.generation";
        ObjectDataGeneratorFunction objectDataGeneratorFunction =new ObjectDataGeneratorFunction();
        objectDataGeneratorFunction.run(objectDataPackage);

        //generateLogo
        LogoGeneratorFunction logoGeneratorFunction = new LogoGeneratorFunction();

        //generateBackGround
        BackGroundGeneratorFunction backGroundGeneratorFunction =new BackGroundGeneratorFunction();

        //generatePlayer
        PlayerGeneratorFunction playerGeneratorFunction = new PlayerGeneratorFunction();

        //generateEnemy
        EnemyGeneratorFunction enemyGeneratorFunction = new EnemyGeneratorFunction();

        //generateBullet
        BulletGeneratorFunction bulletGeneratorFunction = new BulletGeneratorFunction();
    }
}
