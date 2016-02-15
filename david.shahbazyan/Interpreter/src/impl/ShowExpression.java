package impl;

import domains.Context;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 12:29 AM <br/>
 */
public class ShowExpression extends ExpressionImpl {
    public ShowExpression(Context context) {
        super(context);
    }

    @Override
    public void interpret() {
        System.out.println(context.getInput());
    }
}
