package com.synisys.training.patterns.command;

/**
 * Created by emil on 2/7/16.
 */
public enum OperatorType {
	PLUS('+'),
	MINUS('-'),
	DIVIDE('/'),
	MULTIPLY('*');



	private char operator;

	private OperatorType(char operator){
		this.operator = operator;
	}

	public char getOperator(){
		return this.operator;
	}

}
