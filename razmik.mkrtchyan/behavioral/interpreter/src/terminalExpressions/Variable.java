package terminalExpressions;

import api.Expression;

import java.util.Map;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 15, 2016.
 *  
 */
public class Variable implements Expression {
    private String variable;
    private int value;

    public Variable(String variable) {
        this.variable = variable;
    }

    @Override
    public void interpret(Map<String, Integer> context) {
        this.value = context.get(variable);
    }

    public int getValue() {
        return value;
    }
}
