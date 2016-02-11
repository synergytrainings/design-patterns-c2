package com.synisys.de.rwandaIngo.command;

/**
 * Created by Luiza.Karapetyan on 2/4/2016.
 */
/**
 * Command that moves the player up one space
 */
public class MoveUpCommand implements Command {
    private GameBoard gb;

    public MoveUpCommand( GameBoard gb ) {
        this.gb = gb;
    }

    @Override
    public void execute() {
        int ypos = gb.getYPos();
        int xpos = gb.getXPos();
        if( ypos < GameBoard.YMAX ) {
            gb.setYPos( ++ypos );
            System.out.println("new Position of YPos is: "+ gb.getYPos());
        }
        if( xpos < GameBoard.XMAX ) {
            gb.setXPos(++xpos);
            System.out.println("new Position of YPos is: "+ gb.getXPos());
        }
        if( ypos ==GameBoard.YMAX ){
            System.out.println("You have no more possibility to do another step");
        }
        if( ypos > GameBoard.YMAX ){
            System.out.println("Invalid Move: Please undo and try again.");
        }
    }

    @Override
    public void undo() {
        int ypos = gb.getYPos();
        int xpos = gb.getXPos();
        if( ypos > 0 ) {
            gb.setYPos( --ypos );
        }
        if( xpos > 0 ) {
            gb.setXPos(--xpos);
        }
    }
}
