package com.synisys.trainings.interpreter;

/**
 * Created by emil on 2/21/16.
 */
public class AddExpression extends NonTerminalExpression {
	public int evaluate(Context c) {
		return getLeftNode().evaluate(c) + getRightNode().evaluate(c);
	}

	public AddExpression(Expression leftNode, Expression rightNode) {
		super(leftNode, rightNode);
	}
}
