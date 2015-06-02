package creators;

import domain.Dialog;
import domain.UnspecifiedDialog;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 6:13 AM <br/>
 */
public abstract class AbstractDialogCreator {
    public Dialog createDialog() {
        return new UnspecifiedDialog();
    }
}
