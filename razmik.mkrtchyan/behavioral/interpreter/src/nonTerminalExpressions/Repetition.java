package nonTerminalExpressions;

import api.Expression;
import terminalExpressions.Variable;

import java.util.Map;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 15, 2016.
 *  
 */
public class Repetition implements Expression {
    private Variable variable;
    private Expression expression;


    public Repetition(Variable variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public void interpret(Map<String, Integer> context) {
        variable.interpret(context);
        for (int i = 0; i < variable.getValue(); i++) {
            expression.interpret(context);
        }
    }
}
