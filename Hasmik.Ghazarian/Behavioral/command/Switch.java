package com.synisys.de.peru.command;

/**
 * Author: Hasmik Ghazaryan on 2/4/2016.
 */
public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;
    public Switch(Command flipUpCmd,Command flipDownCmd){
        this.flipUpCommand=flipUpCmd;
        this.flipDownCommand=flipDownCmd;
    }
    public void flipUp(){
        flipUpCommand.execute();
    }
    public void flipDown(){
        flipDownCommand.execute();
    }
}
