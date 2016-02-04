package client;

import commandApi.Command;
import commandImpl.ConditionerHighCommand;
import commandImpl.ConditionerLowCommand;
import commandImpl.ConditionerMediumCommand;
import commandImpl.ConditionerOffCommand;
import invoker.ConditionerRemoteControlWithUndo;
import receiver.Conditioner;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 04, 2016.
 *  
 */
public class Client {
    public static void main(String[] args) {
        ConditionerRemoteControlWithUndo conditionerRemoteControlWithUndo = new ConditionerRemoteControlWithUndo();
        Conditioner conditioner = new Conditioner("Sony", "Living Room");
        Command highCommand = new ConditionerHighCommand(conditioner);
        Command lowCommand = new ConditionerLowCommand(conditioner);
        Command mediumCommand = new ConditionerMediumCommand(conditioner);
        Command offCommand = new ConditionerOffCommand(conditioner);

        conditionerRemoteControlWithUndo.setCommand(0, highCommand);
        conditionerRemoteControlWithUndo.setCommand(1, lowCommand);
        conditionerRemoteControlWithUndo.setCommand(2, mediumCommand);
        conditionerRemoteControlWithUndo.setCommand(3, offCommand);


        conditionerRemoteControlWithUndo.buttonWasPressed(0);
        conditionerRemoteControlWithUndo.buttonWasPressed(1);
        conditionerRemoteControlWithUndo.undoButtonWasPressed();
        conditionerRemoteControlWithUndo.buttonWasPressed(2);
        conditionerRemoteControlWithUndo.undoButtonWasPressed();
        conditionerRemoteControlWithUndo.buttonWasPressed(3);

    }
}
