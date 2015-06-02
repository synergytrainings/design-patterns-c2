package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 5/26/15 <br/>
 * <b>Time:</b> 6:00 AM <br/>
 */
public class FatalDialog implements Dialog {
    @Override
    public String getMessage() {
        return "Attention! Fatal error occurred!";
    }
}
