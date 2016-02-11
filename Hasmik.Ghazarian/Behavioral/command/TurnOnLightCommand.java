package com.synisys.de.peru.command;

/**
 * Author: Hasmik Ghazaryan on 2/4/2016.
 */
public class TurnOnLightCommand implements Command{
    private Light theLight;
    public TurnOnLightCommand(Light light){
        this.theLight=light;
    }
    public void execute(){
        theLight.turnOn();
    }
}
