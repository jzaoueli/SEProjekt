package todo.game.enemy;

/**
 * Frame Animation
 */

import todo.enemy.EnemyFrame;
import todo.game.Frame;

class EnemyAnimation {

    /**
     * Counts ticks for change
     */
    private int frameCount;
    /**
     * Frame delay (1-12)
     */
    private int frameDelay;
    /**
     * Index of the current Animations Frame
     */
    private int currentFrameIndex;
    /**
     * Total amount of Frames in the Animation
     */
    private int totalFrames;
    /**
     * Frame Array
     */
    private Frame[] frames = new Frame[3];

    private EnemyFrame sprite;

    public EnemyAnimation(Frame[] frames, int frameDelay) {
        this.frames = frames;
        this.frameDelay = frameDelay;
        this.frameCount = 0;
        this.currentFrameIndex = 0;
        this.totalFrames = this.frames.length;
    }

    public void update() {
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
    }
}
