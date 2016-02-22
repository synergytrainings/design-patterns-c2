package com.synisys.trainings.interpreter;

/**
 * Created by emil on 2/21/16.
 */
public class DivideExpression extends NonTerminalExpression{
	public double evaluate(Context c) {
		return getLeftNode().evaluate(c) / getRightNode().evaluate(c);
	}

	public DivideExpression(Expression leftNode, Expression rightNode) {
		super(leftNode, rightNode);
	}
}
