package com.synisys.training.patterns.command;

/**
 * Created by emil on 2/7/16.
 */
public class Calculator {
	private int current = 0;

	public void operation(OperatorType operator, int operand) throws Exception {
		switch (operator) {
			case PLUS:
				current += operand;
				break;
			case MINUS:
				current -= operand;
				break;
			case MULTIPLY:
				current *= operand;
				break;
			case DIVIDE:
				current /= operand;
			default:
				throw new Exception("Unsupported operation type");
		}

	}
}
