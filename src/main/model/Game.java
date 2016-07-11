package main.model;

import main.view.GameGUI;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Game Logic
 * TODO Documentation
 */
public class Game {

    public ArrayList<Bullet> onScreenBullet = new ArrayList<>();
    public ArrayList<Enemy> aliveEnemy = new ArrayList<>();
    public ArrayList<Item> leftItem = new ArrayList<>();

    public Player player;
    private int bulletRate = 250;
    private int enemyRate = 1000;
    private int randomType;
    private int randomRate;
    private int randomStartX;
    private int speed = 4;
    private int distance = 0;
    private int highScore = 0;
    private ArrayList<Object[]> bulletClass;
    private ArrayList<Object[]> enemyClass;
    /**
     * Enemy Timer
     * creates Enemies at specified enemyRate
     */
    public Timer enemyTimer = new Timer(enemyRate, e -> {
        randomType = (int) (Math.random() * 6);
        randomRate = (int) (Math.random() * 10);
        randomStartX = (int) (Math.random() * 272) + 32;
        switch (randomType) {
            case 0:
                if (randomRate > 0) {
                    try {
                        aliveEnemy.add(new Enemy(enemyClass.get(randomType), randomStartX));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            case 1:
                if (randomRate > 1) {
                    try {
                        aliveEnemy.add(new Enemy(enemyClass.get(randomType), randomStartX));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            case 2:
                if (randomRate > 5) {
                    try {
                        aliveEnemy.add(new Enemy(enemyClass.get(randomType), randomStartX));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            case 3:
                if (randomRate > 6) {
                    try {
                        aliveEnemy.add(new Enemy(enemyClass.get(randomType), randomStartX));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            case 4:
                if (randomRate > 7) {
                    try {
                        aliveEnemy.add(new Enemy(enemyClass.get(randomType), randomStartX));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            case 5:
                if (randomRate > 8) {
                    try {
                        aliveEnemy.add(new Enemy(enemyClass.get(randomType), randomStartX));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            default:

        }
        for (Iterator<Enemy> enemyIterator = aliveEnemy.iterator(); enemyIterator.hasNext(); ) {
            Enemy enemy = enemyIterator.next();
            if (enemy.getY() > 480) {
                enemyIterator.remove();
            }
            if (enemy.getDefense() <= 0) {
                enemyIterator.remove();
            }
        }
    });
    private ArrayList<Object[]> itemClass;
    /**
     * Bullet Shoot Timer
     * creates Bullets at specified bulletRate
     */
    private Timer shootTimer = new Timer(bulletRate, e -> {
        try {
            onScreenBullet.add(new Bullet(bulletClass.get(0), player.getX(), player.getY(), speed));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        for (Iterator<Bullet> bulletIterator = onScreenBullet.iterator(); bulletIterator.hasNext(); ) {
            Bullet bullet = bulletIterator.next();
            if (bullet.getY() < 0) {
                bulletIterator.remove();
            }
        }
    });

    public Game(Player player, ArrayList<Object[]> bulletClass, ArrayList<Object[]> enemyClass, ArrayList<Object[]> itemClass) throws IOException, InterruptedException {
        this.player = player;
        this.bulletClass = bulletClass;
        this.enemyClass = enemyClass;
        this.itemClass = itemClass;
    }

    public void play(GameGUI gameGUI) {
        gameGUI.setVisible(true);
        shootTimer.start();
        enemyTimer.start();
    }

    public int getEnemyRate() {
        return enemyRate;
    }

    public void setEnemyRate(int enemyRate) {
        this.enemyRate = enemyRate;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
