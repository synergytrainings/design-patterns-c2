package com.synisys.de.peru.command1;

/**
 * Author: Hasmik Ghazaryan on 2/4/2016.
 */
public interface UndoableCommand extends Command {
    public void undo();
    public void redo();

}
