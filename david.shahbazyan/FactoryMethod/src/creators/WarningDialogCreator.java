package creators;

import domain.Dialog;
import domain.WarningDialog;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 6:15 AM <br/>
 */
public class WarningDialogCreator extends AbstractDialogCreator {
    @Override
    public Dialog createDialog() {
        return new WarningDialog();
    }
}
