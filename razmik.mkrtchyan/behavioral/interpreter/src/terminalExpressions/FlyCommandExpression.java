package terminalExpressions;

import api.AbstractTerminalExpression;
import model.modelApi.Model;

import java.util.Map;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 15, 2016.
 *  
 */
public class FlyCommandExpression extends AbstractTerminalExpression {
    public FlyCommandExpression(Model model) {
        super(model);
    }

    @Override
    public void interpret(Map<String,Integer> context) {
        model.fly();
    }
}
