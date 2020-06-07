// ID 316044809
package game.levels;

import game.collections.Sprite;
import game.elements.objects.Block;
import game.elements.physics.Velocity;

import java.util.List;

/**
 * The interface Level information.
 */
public interface LevelInformation {

    /**
     * Number of balls int.
     *
     * @return the int
     */
    int numberOfBalls();

    /**
     * Initial ball velocities.
     * The initial velocity of each ball
     * must be that initialBallVelocities().size() == numberOfBalls()
     *
     * @return the list of the ball velocities
     */
    List<Velocity> initialBallVelocities();

    /**
     * Paddle speed int.
     *
     * @return the speed of the paddle
     */
    int paddleSpeed();

    /**
     * Paddle width int.
     *
     * @return the Paddle width
     */
    int paddleWidth();

    /**
     * Level name string.
     * the level name will be displayed at the top of the screen.
     *
     * @return the Level name
     */
    String levelName();

    /**
     * Get background.
     * Returns a sprite with the background of the level
     *
     * @return the background
     */
    Sprite getBackground();

    /**
     * Blocks list.
     * The Blocks that make up this level, each block contains
     * its size, color and location.
     *
     * @return the list
     */
    List<Block> blocks();

    /**
     * Number of blocks to remove int.
     * Number of blocks that should be removed
     * before the level is considered to be "cleared".
     * This number should be <= blocks.size();
     *
     * @return the int
     */
    int numberOfBlocksToRemove();

}
