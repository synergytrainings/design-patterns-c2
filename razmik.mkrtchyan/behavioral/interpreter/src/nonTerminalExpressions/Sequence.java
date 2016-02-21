package nonTerminalExpressions;

import api.Expression;

import java.util.Map;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 15, 2016.
 *  
 */
public class Sequence implements Expression {
    private Expression expression1;
    private Expression expression2;

    public Sequence(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public void interpret(Map<String,Integer> context) {
        this.expression1.interpret(context);
        this.expression2.interpret(context);
    }
}
