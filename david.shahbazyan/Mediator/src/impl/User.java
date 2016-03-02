package impl;

import api.Client;
import api.Mediator;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 3/3/16 <br/>
 * <b>Time:</b> 1:44 AM <br/>
 */
public class User extends Client {
    public User(Mediator mediator, Integer userId, String userName) {
        super(mediator, userId, userName);
    }

    @Override
    public void notifyAboutNewMessage() {
        showPopup("[New Message Received!]");
    }

    private void showPopup(String message) {
        // Popup implementation goes here
        System.out.println(getUserName() + " >> " + message);
    }
}
