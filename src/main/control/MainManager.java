package main.control;

import main.generated.bullet.BulletNormal;
import main.generated.enemy.*;
import main.generated.image.ImageBackground;
import main.generated.image.ImagePlayer;
import main.model.Game;
import main.model.Player;
import main.view.GameGUI;
import main.view.GamePanel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * TODO Game Control
 * TODO Documentation
 */
public class MainManager {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedImage backgroundImage = ImageIO.read(new File("images/" + new ImageBackground().getFileName()));
        Player player = new Player(new ImagePlayer().getPlayerImage());

        ArrayList<Object[]> bulletClass = new ArrayList<>();
        bulletClass.add(new BulletNormal().getBulletImage());
        //TODO Alle Bullet Klassen hinzufügen

        ArrayList<Object[]> enemyClass = new ArrayList<>();
        enemyClass.add(new CommonAttackEnemyData().getCommonAttackEnemyData());
        enemyClass.add(new CommonDefenseEnemyData().getCommonDefenseEnemyData());
        enemyClass.add(new UncommonAttackEnemyData().getUncommonAttackEnemyData());
        enemyClass.add(new UncommonDefenseEnemyData().getUncommonDefenseEnemyData());
        enemyClass.add(new RareAttackEnemyData().getRareAttackEnemyData());
        enemyClass.add(new RareDefenseEnemyData().getRareDefenseEnemyData());

        ArrayList<Object[]> itemClass = new ArrayList<>();
        // TODO Alle Item Klassen hinzufügen

        Game game = new Game(player, bulletClass, enemyClass, itemClass);
        GamePanel gamePanel = new GamePanel(backgroundImage, game);
        GameGUI gameGUI = new GameGUI(gamePanel);
        game.play(gameGUI);

        //BufferedImage gameLogo = ImageIO.read(new File(new ImageLogo().getFileName()));
        //GameStart gameStart = new GameStart(gameLogo, game);
        //gameStart.setVisible(true);
    }
}
