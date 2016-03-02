package api;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 3/3/16 <br/>
 * <b>Time:</b> 2:56 AM <br/>
 */
public abstract class Client {
    private final Mediator mediator;
    private final Integer userId;
    private final String userName;

    protected Client(Mediator mediator, Integer userId, String userName) {
        this.mediator = mediator;
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public abstract void notifyAboutNewMessage();
}
