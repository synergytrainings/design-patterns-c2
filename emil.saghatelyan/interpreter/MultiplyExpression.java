package com.synisys.trainings.interpreter;

/**
 * Created by emil on 2/21/16.
 */
public class MultiplyExpression extends NonTerminalExpression {
	public double evaluate(Context c) {
		return getLeftNode().evaluate(c) * getRightNode().evaluate(c);
	}

	public MultiplyExpression(Expression l, Expression r) {
		super(l, r);
	}

}
