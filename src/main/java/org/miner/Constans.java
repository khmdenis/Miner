package org.miner;

/**
 * Created by denis on 06.07.16.
 */
public class Constans {
    public static final int CELL_SIZE = 32;

    public static final int CELLS_COUNT_X = 10;
    public static final int CELLS_COUNT_Y = 10;

    public static final int SCREEN_WIDTH =CELLS_COUNT_X*CELL_SIZE;
    public static final int SCREEN_HEIGHT = CELLS_COUNT_Y*CELL_SIZE;
    public static final String NAME = "Miner";

    public static final Sprite[] skin_by_number = {
            Sprite.ZERO,
            Sprite.ONE,
            Sprite.TWO,
            Sprite.THREE,
            Sprite.FOUR,
            Sprite.FIVE,
            Sprite.SIX,
            Sprite.SEVEN,
            Sprite.EIGHT
    };

}
