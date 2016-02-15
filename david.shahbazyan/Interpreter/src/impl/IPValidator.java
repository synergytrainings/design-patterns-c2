package impl;

import domains.Context;
import interfaces.Validator;

import java.util.List;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 11:00 PM <br/>
 */
public class IPValidator implements Validator {
    List<Validator> validators;

    public IPValidator(List<Validator> validators) {
        this.validators = validators;
    }

    @Override
    public boolean validate(Context context) {
        System.out.println("IPValidator::validate()");
        boolean retVal = true;
        for (Validator validator : validators) {
            retVal = retVal && validator.validate(context);
        }
        return retVal;
    }
}
