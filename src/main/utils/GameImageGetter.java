package main.utils;


import main.generated.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameImageGetter {

    private Logo logo;
    private BackGround backGround;
    private Player player;
    private Enemy enemy;
    private Bullet bullet;


    public BufferedImage getGameStartLogo() throws IOException {
        return getBufferedImage(logo.getFileName());
    }

    public BufferedImage getGameBackGround() throws IOException {
        return getBufferedImage(backGround.getFileName());
    }

    public BufferedImage[] getPlayerImages() throws IOException {
        return getFrames(player.getFileName(), player.getNumberLine(), player.getNumberColumn(), player.getWidth(), player.getHeight());
    }

    public BufferedImage[] getEnemyImages() throws IOException {
        return getFrames(enemy.getFileName(), enemy.getNumberLine(), enemy.getNumberColumn(), enemy.getWidth(), enemy.getHeight());
    }

    public BufferedImage[] getBulletImages() throws IOException {
        return getFrames(bullet.getFileName(), bullet.getNumberLine(), bullet.getNumberColumn(), bullet.getWidth(), bullet.getHeight());
    }

    private BufferedImage[] getFrames(String fileName, int line, int column, int width, int height) throws IOException {
        int size = width * height;

        BufferedImage[] frames = new BufferedImage[size];
        BufferedImage spriteSheet = getBufferedImage(fileName);

        //Divide Image into Frames
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                frames[(i * column) + j] = spriteSheet.getSubimage(j * (width), i * (height), width, height);
            }
        }
        return frames;
    }

    private BufferedImage getBufferedImage(String fileName) throws IOException {
        File inputFile = new File(fileName);
        return ImageIO.read(inputFile);
    }
}
