package todo.enemy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * sets the Sheet for the enemy.
 */

class EnemyFrame {
    /**Current Action of Enemy*/
    private String action;
    /**Sprites in Image File*/
    private static BufferedImage[] sprites;
    /**Sprite Set to be used for an Action*/
    private static BufferedImage[] actionSprites;

    /**Sprite Constructor creates Sprite Set from SpriteSheet Image File*/
    public EnemyFrame(String[] imageFile) throws IOException {
        sprites = loadSheet(imageFile);
    }

    /**Loads the SpriteSheet File and divides it into Sprites.*/
    private BufferedImage[] loadSheet(String[] imageFile) throws IOException {
        /**File Name*/
        String file = imageFile[0];
        /**Number of Rows in one SpriteSheet*/
        int row = Integer.parseInt(file);
        /**Number of Columns in one SpriteSheet*/
        int col = Integer.parseInt(imageFile[2]);
        /**Size of one Sprite (square)*/
        int size = Integer.parseInt(imageFile[3]);

        sprites = new BufferedImage[row * col];

        BufferedImage spriteSheet = ImageIO.read(new File(file));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sprites[(i * col) + j] = spriteSheet.getSubimage(j * size, i * size, size, size);
            }
        }
        return sprites;
    }

    /**Sets Sprites for an Action
     *@param rowNumber States which Row of Sprites of the SpriteSheet will be used for the Action*/
    private static void setActionSprites(BufferedImage[] sprites, int rowNumber){
        System.arraycopy(sprites, rowNumber, actionSprites, 0, actionSprites.length);
    }

    static void updateSprites(String action){
        switch (action){
            case "move":
                setActionSprites(sprites, 0);
            case "bulletHit":
                setActionSprites(sprites, 1);
            case "die":
                setActionSprites(sprites, 2);
        }
    }
}