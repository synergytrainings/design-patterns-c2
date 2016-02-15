package impl;

import domains.Context;
import interfaces.Expression;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 1:00 PM <br/>
 */
public abstract class ExpressionImpl implements Expression {
    Context context;

    public ExpressionImpl(Context context) {
        this.context = context;
    }
}
