package com.synisys.trainings.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	private String expression;

	private HashMap<String, Integer> operators;

	private Context ctx;



	public Calculator() {
		operators = new HashMap();
		operators.put("+", 1);
		operators.put("-", 1);
		operators.put("/", 2);
		operators.put("*", 2);
		operators.put("(", 0);
	}



	public void setContext(Context c) {
		ctx = c;
	}

	public void setExpression(String expr) {
		expression = expr;
	}

	public double evaluate() {
		//infix to Postfix
		String pfExpr = infixToPostFix(expression);

		//build the Binary Tree
		Expression rootNode = buildTree(pfExpr);


		return rootNode.evaluate(ctx);
	}

	private NonTerminalExpression getNonTerminalExpression(String operation,
														   Expression left, Expression right) {
		NonTerminalExpression exp = null;
		switch (operation) {
			case "+":
				exp = new AddExpression(left, right);
				break;
			case "-":
				exp = new SubtractExpression(left, right);
				break;
			case "*":
				exp = new MultiplyExpression(left, right);
				break;
			case "/":
				exp = new DivideExpression(left, right);
				break;
		}

		return exp;
	}

	private Expression buildTree(String expr) {
		Stack s = new Stack();

		for (int i = 0; i < expr.length(); i++) {
			String currChar = expr.substring(i, i + 1);

			if (!isOperator(currChar)) {
				Expression e = new TerminalExpression(currChar);
				s.push(e);
			} else {
				Expression r = (Expression) s.pop();
				Expression l = (Expression) s.pop();
				Expression n = getNonTerminalExpression(currChar, l, r);
				s.push(n);
			}
		}
		return (Expression) s.pop();
	}

	private String infixToPostFix(String str) {
		Stack s = new Stack();
		String pfExpr = "";
		String tempStr = "";

		String expr = str.trim();
		for (int i = 0; i < str.length(); i++) {

			String currChar = str.substring(i, i + 1);

			if (!isOperator(currChar) && !currChar.equals("(")
					&& !currChar.equals(")")) {
				pfExpr = pfExpr + currChar;
			}
			if (currChar.equals("(")) {
				s.push(currChar);
			}

			if (currChar.equals(")")) {
				tempStr = (String) s.pop();
				while (!tempStr.equals("(")) {
					pfExpr = pfExpr + tempStr;
					tempStr = (String) s.pop();
				}
				tempStr = "";
			}

			if (isOperator(currChar)) {
				if (!s.isEmpty()) {
					tempStr = (String) s.pop();
					Integer val1 = operators.get(tempStr);
					Integer val2 = operators.get(currChar);

					while (val1 >= val2) {
						pfExpr = pfExpr + tempStr;
						val1 = -100;
						if (!s.isEmpty()) {
							tempStr = (String) s.pop();
							val1 = operators.get(tempStr);

						}
					}
					if (val1 < val2 && val1 != -100)
						s.push(tempStr);
				}
				s.push(currChar);
			}

		}
		while (!s.isEmpty()) {
			tempStr = (String) s.pop();
			pfExpr = pfExpr + tempStr;
		}
		return pfExpr;
	}

	private boolean isOperator(String str) {
		return str.equals("+") || str.equals("-") || str.equals("*")
				|| str.equals("/");

	}


}
