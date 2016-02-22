package com.synisys.trainings.interpreter;

/**
 * Created by emil on 2/21/16.
 */
public abstract class NonTerminalExpression implements Expression {
	private Expression leftNode;

	private Expression rightNode;

	public NonTerminalExpression(Expression l, Expression r) {
		setLeftNode(l);
		setRightNode(r);
	}

	public void setLeftNode(Expression node) {
		leftNode = node;
	}

	public void setRightNode(Expression node) {
		rightNode = node;
	}

	public Expression getLeftNode() {
		return leftNode;
	}

	public Expression getRightNode() {
		return rightNode;
	}
}
