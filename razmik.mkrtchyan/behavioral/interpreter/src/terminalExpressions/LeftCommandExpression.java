package terminalExpressions;

import api.AbstractTerminalExpression;
import model.modelApi.Model;

import java.util.Map;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 15, 2016.
 *  
 */
public class LeftCommandExpression extends AbstractTerminalExpression {
    public LeftCommandExpression(Model model) {
        super(model);
    }

    @Override
    public void interpret(Map<String, Integer> context) {
        model.toLeft();
    }
}
