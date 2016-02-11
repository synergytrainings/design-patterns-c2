package com.synisys.de.rwandaIngo.command;

import java.util.ArrayList;

/**
 * Created by Luiza.Karapetyan on 2/11/2016.
 */
public class ManagerCommands {
    private ArrayList<Command> listCommands= new ArrayList();
    public void addCommand(Command command){
        listCommands.add(command);
    }

    public void run(){
        for(Command command:listCommands){
            command.execute();
        }
    }
}
