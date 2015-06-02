package creators;

import domain.*;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 5:52 AM <br/>
 */
public final class ParametrizedDialogCreator {
    private ParametrizedDialogCreator() { /* No instance creation */ }

    public static Dialog createDialog(Severity severity) {
        Dialog dialog;
        switch (severity) {
            case INFORMATION:
                dialog = new InformationDialog();
                break;
            case WARNING:
                dialog = new WarningDialog();
                break;
            case ERROR:
                dialog = new ErrorDialog();
                break;
            case FATAL:
                dialog = new FatalDialog();
                break;
            default:
                throw new IllegalArgumentException(String.format("An \"%s\" argument is not valid.", severity));
        }
        return dialog;
    }
}
