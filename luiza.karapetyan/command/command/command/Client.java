package com.synisys.de.rwandaIngo.command;

/**
 * Created by Luiza.Karapetyan on 2/4/2016.
 */
public class Client {
    public static void main(String[] args) {
        GameBoard gb = new GameBoard();
        gb.setYPos(8);
        MoveUpCommand moveUp = new MoveUpCommand(gb);
        MoveDownCommand moveDown = new MoveDownCommand(gb);
        Game game = new Game(moveUp, moveDown);
        game.moveUpAction();
        game.undoAction();
    }

}
