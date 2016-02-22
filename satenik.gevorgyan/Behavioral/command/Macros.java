package command;

import command.domain.commands.Command;

import java.util.List;

public class Macros implements Command {
    private List<Command> commands;

    public Macros(List<Command> commands) {
        this.commands = commands;
    }

    public void setCommands(List<Command> commands){
        this.commands = commands;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void execute(){
        for(Command next: commands){
            next.execute();
        }
    }
}
