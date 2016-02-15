package interfaces;

import domains.Context;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/15/16 <br/>
 * <b>Time:</b> 8:28 PM <br/>
 */
public interface Validator {
    boolean validate(Context context);
}
