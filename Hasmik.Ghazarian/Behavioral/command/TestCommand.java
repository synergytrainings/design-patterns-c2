package com.synisys.de.peru.command;

/**
 * Author: Hasmik Ghazaryan on 2/4/2016.
 */
public class TestCommand {
    public static void main(String[] args){
        Light l = new Light();
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);
        Switch s = new Switch(switchUp,switchDown);
        s.flipUp();
        s.flipDown();
    }
}

