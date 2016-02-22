package com.synisys.trainings.interpreter;

/**
 * Created by emil on 2/21/16.
 */
public class TerminalExpression implements Expression {
	private String value;

	public TerminalExpression(String v) {
		value = v;
	}

	public double evaluate(Context c) {
		return c.getValue(value);
	}
}
