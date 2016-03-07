package V1.api;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 3/3/16 <br/>
 * <b>Time:</b> 2:55 AM <br/>
 */
public interface Mediator {
    void sendMessage(String message, Client fromClient);
}
