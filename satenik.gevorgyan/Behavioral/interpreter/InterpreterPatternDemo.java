package interpreter;

import interpreter.domain.*;

import java.util.Stack;

/**
 * Created by satenik.gevorgyan on 2/29/2016.
 */
public class InterpreterPatternDemo {
    public static void main(String args[]) {
        String tokenString = "4 3 2 - 1 + *";
        Stack<Expression> stack = new Stack<Expression>();

        String[] tokenList = tokenString.split(" ");
        for (String s : tokenList) {
            if (isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = getOperatorInstance(s, leftExpression,
                        rightExpression);
                int result = operator.interpret();
                stack.push(new NumberExpression(result));
            } else {
                Expression expression = new NumberExpression(s);
                stack.push(expression);
            }
        }
        System.out.println("Result: "+stack.pop().interpret());
    }

    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*"))
            return true;
        else
            return false;
    }

    public static Expression getOperatorInstance(String s, Expression left,
                                                 Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
        }
        return null;
    }
}
