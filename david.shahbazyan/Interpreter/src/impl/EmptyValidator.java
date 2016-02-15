package impl;

import domains.Context;
import interfaces.Validator;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 9:57 PM <br/>
 */
public class EmptyValidator implements Validator {
    private Context context;

    public EmptyValidator(Context context) {
        this.context = context;
    }

    @Override
    public boolean validate(Context context) {
        System.out.println("EmptyValidator::validate()");
        return context != null && context.getInput() != null && !context.getInput().isEmpty();
    }
}
