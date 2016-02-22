package com.synisys.trainings.interpreter;

/**
 * Created by emil on 2/21/16.
 */
public class SubtractExpression extends NonTerminalExpression {
	public double evaluate(Context c) {
		return getLeftNode().evaluate(c) - getRightNode().evaluate(c);
	}

	public SubtractExpression(Expression leftNode, Expression rightNode) {
		super(leftNode, rightNode);
	}
}
