package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 5:59 AM <br/>
 */
public class UnspecifiedDialog implements Dialog {
    @Override
    public String getMessage() {
        return "This is an unspecified dialog default implementation message.";
    }
}
