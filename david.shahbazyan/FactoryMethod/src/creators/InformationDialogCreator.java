package creators;

import domain.Dialog;
import domain.InformationDialog;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 6:15 AM <br/>
 */
public class InformationDialogCreator extends AbstractDialogCreator {
    @Override
    public Dialog createDialog() {
        return new InformationDialog();
    }
}
