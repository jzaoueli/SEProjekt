package main.view;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Loads Image File for Object Animation
 * Animates the Frames
 */
public class FrameAnimation {
    /**
     * Counts ticks for Frame Change
     */
    private static int frameCount;
    /**
     * Frame delay (1-12)
     */
    private static int frameDelay;
    /**
     * Frame Array
     */
    private static BufferedImage[] frames;
    /**
     * Index of the current Frame in Array
     */
    private static int currentFrameIndex;
    /**
     * Current Frame
     */
    BufferedImage frame;
    /**
     * Total amount of Frames in Array
     */
    private static int totalFrames;

    /**
     * Image Dimensions
     */
    private int rows;
    private int cols;
    private int sizeX;
    private int sizeY;
    /**
     * Set of Frames to be animated
     */
    private BufferedImage[] actionFrames = new BufferedImage[4];

    /**
     * Constructor FrameAnimation
     * @param frameDelay Display duration of each Frame in Array
     */
    FrameAnimation(String[] objectData, int frameDelay) throws IOException {
        setActionFrames(loadFrames(objectData), 0);
        FrameAnimation.frameDelay = frameDelay;
        totalFrames = actionFrames.length;
        frameCount = 0;
        setActionFrames(actionFrames, 0);
        currentFrameIndex = 0;
    }

    /**
     * Animates the Frame Array
     * Substitutes the current Frame for the next Frame each frameCount
     * currentFrameIndex will reset when ist reaches the end of Frame Array
     */
    void animate() {
        frameCount++;
        if (frameCount > frameDelay) {
            frameCount = 0;
            currentFrameIndex++;
            if (currentFrameIndex > totalFrames - 1) {
                currentFrameIndex = 0;
            } else if (currentFrameIndex < 0) {
                currentFrameIndex = totalFrames - 1;
            }
            frame = actionFrames[currentFrameIndex];
        }
    }

    /**
     * Loads Image File and divides it into sub-images (Frames)
     * @param imageData holds Image File name and its Dimensions
     * @return Frame Array containing all sub-images of Image File
     * @throws IOException
     */
    private BufferedImage[] loadFrames(String[] imageData) throws IOException {

        /**
         * File name
         */
        String file = imageData[0];
        /**
         * Number of Frame Rows in Image File
         */
        rows = Integer.parseInt(imageData[1]);
        /**
         * Number of Frame Columns in Image File
         */
        cols = Integer.parseInt(imageData[2]);
        /**
         * Frame Width
         */
        sizeX = Integer.parseInt(imageData[3]);
        /**
         * Frame Height
         */
        sizeY = Integer.parseInt(imageData[4]);
        /**
         * Set Length of Array
         */
        frames = new BufferedImage[rows * cols];
        /**
         * Read Image File
         */
        BufferedImage spriteSheet = ImageIO.read(new File(file));
        /**
         * Divide Image into Frames
         */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                frames[(i * cols) + j] = spriteSheet.getSubimage(j * (sizeX), i * (sizeY), sizeX, sizeY);
            }
        }
        return frames;
    }
    /**
     * Sets Frames for an Action
     * @param rowNumber States which Row of Frames will be used for Object Action
     * @return Frames Array for Action
     */
    private BufferedImage[] setActionFrames(BufferedImage[] frames, int rowNumber){
        System.arraycopy(frames, rowNumber, actionFrames, 0, actionFrames.length);
        return actionFrames;
    }
}