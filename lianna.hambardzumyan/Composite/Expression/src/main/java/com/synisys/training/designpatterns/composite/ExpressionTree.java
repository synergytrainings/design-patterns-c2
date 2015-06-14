package com.synisys.training.designpatterns.composite;

public class ExpressionTree implements Expression{
	private Operator operator;
	private Expression leftExpression;
	private Expression rightExpression;
	
	public ExpressionTree(Operator operator, Expression leftExpresion, Expression rightExpression) {
		this.operator = operator;
		this.leftExpression = leftExpresion;
		this.rightExpression = rightExpression;
	}
	
	@Override
	public int computeValue() {
		return this.operator.compute(leftExpression.computeValue(), rightExpression.computeValue());
	}

	@Override
	public String getAsString() {
		return "(" + leftExpression.getAsString() + operator.toString() + rightExpression.getAsString() + ")";
	}

}
