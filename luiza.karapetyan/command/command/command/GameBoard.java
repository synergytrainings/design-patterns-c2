package com.synisys.de.rwandaIngo.command;

/**
 * Created by Luiza.Karapetyan on 2/4/2016.
 */
/**
 * The receiver, represents a game board
 */
public class GameBoard {
    private int xpos = 0;
    private int ypos = 0;
    public static final int XMAX = 10;
    public static final int YMAX = 10;

    public GameBoard() {
    }

    public int getXPos() {
        return xpos;
    }

    public void setXPos( int xpos ) {
        this.xpos = xpos;
    }

    public int getYPos() {
        return ypos;
    }

    public void setYPos( int ypos ) {
        this.ypos = ypos;
    }
}
