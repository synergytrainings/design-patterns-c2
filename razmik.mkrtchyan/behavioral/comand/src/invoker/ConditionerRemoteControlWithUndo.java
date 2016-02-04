package invoker;

import commandApi.Command;
import receiver.Speed;

import java.util.Stack;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 04, 2016.
 *  
 */
public class ConditionerRemoteControlWithUndo {
    private Command[] commands;
    private Stack<Command> undoCommands = new Stack<>();

    public ConditionerRemoteControlWithUndo() {
        this.commands = new Command[Speed.values().length];
    }

    public void setCommand(int order, Command command) {
        if (!checkIsValidOrder(order)) {
            throw new IndexOutOfBoundsException("Invalid order");
        }
        this.commands[order] = command;
    }

    public void buttonWasPressed(int order) {
        this.commands[order].execute();
        this.undoCommands.push(this.commands[order]);
    }

    public void undoButtonWasPressed() {
        if (!this.undoCommands.isEmpty()) {
            this.undoCommands.pop().undo();
        }
    }

    private boolean checkIsValidOrder(int order) {
        return order > 0 && order < commands.length;
    }
}
