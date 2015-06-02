package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 5:58 AM <br/>
 */
public class WarningDialog implements Dialog {
    @Override
    public String getMessage() {
        return "This is a warning message.";
    }
}
