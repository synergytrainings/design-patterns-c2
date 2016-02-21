package api;

import model.modelApi.Model;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 15, 2016.
 *  
 */
public abstract class AbstractTerminalExpression implements Expression {
    protected Model model;

    public AbstractTerminalExpression(Model model) {
        this.model = model;
    }
}
