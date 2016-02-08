package com.synisys.training.patterns.command;

/**
 * Created by emil on 2/7/16.
 */
public interface Command {
	void execute();
	void undo();
}
