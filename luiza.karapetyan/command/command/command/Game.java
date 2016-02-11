package com.synisys.de.rwandaIngo.command;

/**
 * Created by Luiza.Karapetyan on 2/4/2016.
 */
/**
 * Invoker class
 */
public class Game {
    private Command moveUpCommand;
    private Command moveDownCommand;

    public Game(MoveUpCommand moveUpCommand,MoveDownCommand moveDownCommand) {
       this.moveUpCommand = moveUpCommand;
        this.moveDownCommand = moveDownCommand;
    }

    public void moveUpAction() {
        moveUpCommand.execute();
    }

     public void undoAction(){
        moveDownCommand.undo();
    }


}
