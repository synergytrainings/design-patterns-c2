package com.synisys.training.patterns.command;

import static com.synisys.training.patterns.command.OperatorType.*;

/**
 * Created by emil on 2/7/16.
 */
public class CalculatorCommand implements Command {
	private OperatorType operator;
	private int operand;
	private Calculator calculator;

	public CalculatorCommand(Calculator calculator,
							 OperatorType operator, int operand) {
		this.calculator = calculator;
		this.operator = operator;
		this.operand = operand;
	}

	public OperatorType getOperator() {
		return operator;
	}

	public void setOperator(OperatorType operator) {
		this.operator = operator;
	}

	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

	public void execute() {
		try {
			calculator.operation(operator, operand);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void undo() {
		try {
			calculator.operation(undo(operator), operand);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private OperatorType undo(OperatorType operator) throws Exception {
		OperatorType undo;
		switch (operator) {
			case PLUS:
				undo = OperatorType.MINUS;
				break;
			case MINUS:
				undo = OperatorType.PLUS;
				break;
			case MULTIPLY:
				undo = OperatorType.DIVIDE;
				break;
			case DIVIDE:
				undo = OperatorType.MINUS;
				break;
			default:
				throw new Exception("Unsupported operation type");
		}
		return undo;
	}
}
