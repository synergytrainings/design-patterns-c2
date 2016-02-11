package com.synisys.de.rwandaIngo.command;

/**
 * Created by Luiza.Karapetyan on 2/4/2016.
 */
/**
 * Command that moves the player up down space
 */
public class MoveDownCommand implements Command {
    private GameBoard gb;

    public MoveDownCommand( GameBoard gb ) {
        this.gb = gb;
    }

    @Override
    public void execute() {
        int ypos = gb.getYPos();
        if( ypos > 0 ) {
            gb.setYPos( --ypos );
        }
    }

    @Override
    public void undo() {
        int ypos = gb.getYPos();
        if( ypos < GameBoard.YMAX ) {
            gb.setYPos( ++ypos );
            System.out.println("the position of YPos is: " + gb.getYPos());
        }
    }
}
