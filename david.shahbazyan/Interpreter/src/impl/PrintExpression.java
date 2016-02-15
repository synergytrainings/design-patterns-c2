package impl;

import domains.Context;

import java.util.Date;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 12:29 AM <br/>
 */
public class PrintExpression extends ExpressionImpl {
    public PrintExpression(Context context) {
        super(context);
    }

    @Override
    public void interpret() {
        System.out.println(new Date());
    }
}
