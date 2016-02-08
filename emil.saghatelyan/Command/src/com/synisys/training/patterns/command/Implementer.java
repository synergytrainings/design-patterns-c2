package com.synisys.training.patterns.command;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by emil on 2/7/16.
 */
public class Implementer {
	private Calculator calculator = new Calculator();

	private Stack<Command> undoCommands = new Stack<>();

	private int current = 0;


	public void undo() {
		if (this.undoCommands.size()>0) {
			this.undoCommands.pop().undo();
		}
	}

	public void compute(OperatorType operator, int operand) {
		Command command = new CalculatorCommand(
				calculator,operator, operand);
		command.execute();
		undoCommands.push(command);
		current++;
	}

}
