import api.Expression;
import model.modelApi.Model;
import model.modelImpl.Plane;
import nonTerminalExpressions.Repetition;
import nonTerminalExpressions.Sequence;
import terminalExpressions.FlyCommandExpression;
import terminalExpressions.LeftCommandExpression;
import terminalExpressions.RightCommandExpression;
import terminalExpressions.Variable;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Model model = new Plane();
        Map<String, Integer> context = new HashMap<>();
        context.put("x", 2);
        String expressionStr = "right;left;left;repeat x times fly;right;";
        Expression expression1 = getExpression(expressionStr, context, model);
        expression1.interpret(context);
    }

    private static Expression getExpression(String expressionStr, Map<String, Integer> context, Model model) {
        String[] tokens = expressionStr.split(";", 2);
        Expression expression = getCorrespondingExpression(tokens[0], model);
        if (tokens[1].isEmpty()) {
            return expression;
        }
        return new Sequence(expression, getExpression(tokens[1], context, model));
    }

    private static Expression getCorrespondingTerminalExpression(String expr, Model model) {
        switch (expr) {
            case "fly":
                return new FlyCommandExpression(model);
            case "left":
                return new LeftCommandExpression(model);
            case "right":
                return new RightCommandExpression(model);
            default:
                throw new IllegalArgumentException("invalid format");
        }
    }

    private static Expression getCorrespondingExpression(String expr, Model model) {
        if (expr.trim().contains("repeat")) {
            String[] tokens = expr.split(" ");
            return new Repetition(new Variable(tokens[1]), getCorrespondingExpression(tokens[3], model));
        } else {
            return getCorrespondingTerminalExpression(expr, model);
        }
    }
}
