package dsl.antlr;

import dsl.antlr.gen.GramBaseListener;
import dsl.antlr.gen.GramLexer;
import dsl.antlr.gen.GramParser;
import dsl.antlr.objects.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

import static dsl.antlr.gen.GramParser.*;
import static java.lang.Integer.valueOf;

/**
 * read data from CSV file and give the necessary
 * Background: path of background image file.
 * Player: player image, line, column, width, height;
 */
public class StringParser extends GramBaseListener {

    private Logo logo;
    private BackGround backGround;
    private Player player;
    private Enemy enemy;
    private Bullet bullet;


    public StringParser(String path) throws IOException {
        //"src/dsl/antlr/src.csv"
        FileReader fileReader = new FileReader(path);
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileReader);
        // Get CSV lexer
        GramLexer lexer = new GramLexer(antlrInputStream);
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass the tokens to the parser
        GramParser parser = new GramParser(tokens);
        // Specify our entry point
        FileContext fileContext = parser.file();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        GramBaseListener listener = new StringParser(path);
        walker.walk(listener, fileContext);

    }

    public void exitFile(FileContext ctx) {
        System.err.println("number of objects = " + ctx.getChildCount());

        setLogo(ctx.logo());

        setBackGround(ctx.backGround());

        setPlayer(ctx.player());

        setEnemy(ctx.enemy());

        setBullet(ctx.bullet());
    }

    private void setBullet(BulletContext bulletContext) {
        String fileName = bulletContext.fileName().getText();
        int numberLine = valueOf(bulletContext.nubmerLine().getText());
        int numberColumn = valueOf(bulletContext.numberColumn().getText());
        int width = valueOf(bulletContext.objectWidth().getText());
        int height = valueOf(bulletContext.objectHeight().getText());

        bullet = new Bullet(fileName, numberLine, numberColumn, width, height);
    }

    private void setEnemy(EnemyContext enemyContext) {
        String fileName = enemyContext.fileName().getText();
        int numberLine = valueOf(enemyContext.nubmerLine().getText());
        int numberColumn = valueOf(enemyContext.numberColumn().getText());
        int width = valueOf(enemyContext.objectWidth().getText());
        int height = valueOf(enemyContext.objectHeight().getText());
        String movingType = enemyContext.movingType().getText();
        int speed = valueOf(enemyContext.speed().getText());
        int offense = valueOf(enemyContext.offense().getText());
        int defence = valueOf(enemyContext.defence().getText());
        int probability = valueOf(enemyContext.probability().getText());

        System.out.println("movingType : " + movingType);

        enemy = new Enemy(fileName, numberLine, numberColumn, width, height, movingType, speed, offense, defence, probability);
    }

    private void setPlayer(PlayerContext playerContext) {
        String fileName = playerContext.fileName().getText();
        int numberLine = valueOf(playerContext.nubmerLine().getText());
        int numberColumn = valueOf(playerContext.numberColumn().getText());
        int width = valueOf(playerContext.objectWidth().getText());
        int height = valueOf(playerContext.objectHeight().getText());

        player = new Player(fileName, numberLine, numberColumn, width, height);
    }

    private void setBackGround(BackGroundContext backGroundContext) {
        String fileName = backGroundContext.fileName().getText();
        backGround = new BackGround(fileName);
    }

    private void setLogo(LogoContext logoContext) {
        String fileName = logoContext.fileName().getText();
        logo = new Logo(fileName);
    }

    public Logo getLogo() {
        return logo;
    }

    public BackGround getBackGround() {
        return backGround;
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Bullet getBullet() {
        return bullet;
    }
}
