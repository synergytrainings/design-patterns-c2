package impl;

import domains.Context;
import interfaces.Validator;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 10:27 PM <br/>
 */
public class RangeValidator implements Validator {
    private String[] from;
    private String[] to;

    public RangeValidator(String from, String to) {
        this.from = from.split("\\.");
        this.to = to.split("\\.");
    }

    @Override
    public boolean validate(Context context) {
        System.out.println("RangeValidator::validate()");
        boolean retVal = true;
        String[] cont = context.getInput().split("\\.");
        for (int i = 0; i < cont.length; i++) {
            retVal = retVal && (cont[i].compareTo(from[i]) > -1 && cont[i].compareTo(to[i]) < 1);
        }
        return retVal;
    }
}
