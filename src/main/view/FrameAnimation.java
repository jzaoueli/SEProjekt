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
    private int frameCount;
    /**
     * Frame delay (1-12)
     */
    private static int frameDelay;
    /**
     * Frame Array
     */
    private BufferedImage[] frames;
    /**
     * Index of the current Frame in Array
     */
    private int currentFrameIndex;
    /**
     * Current Frame
     */
    BufferedImage frame;
    /**
     * Total amount of Frames in Array
     */
    private int totalFrames;

    /**
     * Image Dimensions
     */
    private int rows;
    private int cols;
    private int sizeX;
    private int sizeY;
    /**
     * Set of Frames to be animated
     * TODO Frame number must (not) be 4 for better FrameAnimation
     */
    public BufferedImage[] actionFrames = new BufferedImage[4];


    /**
     * Contructor
     * @param objectData Read ObjectData
     * @param frameDelay How long will Frame be showed
     * @throws IOException Load Data
     */
    public FrameAnimation(String[] objectData, int frameDelay) throws IOException {
        loadFrames(objectData);
        FrameAnimation.frameDelay = frameDelay;
        totalFrames = actionFrames.length;
        frameCount = 0;
        currentFrameIndex = 0;
    }

    /**
     * Animates the Frame Array
     * Substitutes the current Frame for the next Frame each frameCount
     * currentFrameIndex will reset when ist reaches the end of Frame Array
     */
    public void animate() {
        frameCount++;
        if (frameCount > frameDelay) {
            frameCount = 0;
            currentFrameIndex++;
            if (currentFrameIndex > totalFrames - 1) {
                currentFrameIndex = 0;
            } else if (currentFrameIndex < 0) {
                currentFrameIndex = totalFrames - 1;
            }
        }
        frame = actionFrames[currentFrameIndex];
    }

    /**
     * TODO Animates Frame Set one time
     */
    void animateOnce(){
        frameCount++;
        if (frameCount > frameDelay) {
            frameCount = 0;
            currentFrameIndex++;
            if (currentFrameIndex > totalFrames - 1) {
                currentFrameIndex = 0;
            }
            frame = actionFrames[currentFrameIndex];
        }
    }
    /**
     * Loads Image File and divides it into sub-images (Frames)
     * @param imageData ObjectData holding Image File name and its Dimensions
     * @return Frame Array containing all sub-images of Image File
     * @throws IOException Image File
     */
    private BufferedImage[] loadFrames(String[] imageData) throws IOException{
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
    public BufferedImage[] setActionFrames(int rowNumber){
        System.arraycopy(frames, rowNumber * 4, actionFrames, 0, actionFrames.length);
        return actionFrames;
    }
}