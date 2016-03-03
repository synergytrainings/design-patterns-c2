package V1.impl;

import java.util.ArrayList;
import java.util.List;

import V1.api.Client;
import V1.api.Mediator;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 3/3/16 <br/>
 * <b>Time:</b> 1:44 AM <br/>
 */
public class Channel implements Mediator {
    private List<Client> users = new ArrayList<>();

    public void addUser(Client client) {
        this.users.add(client);
    }
    public void removeUser(Client client) {
        this.users.remove(client);
    }

    public List<Client> getUsers() {
        return users;
    }

    @Override
    public void sendMessage(String message, Client fromClient) {
        String formattedMessage = String.format("%s says: %s", fromClient.getUserName(), message);
        for (Client user : users) {
            if (!user.equals(fromClient)) {
                System.out.println(formattedMessage);
                // Send message functionality goes here...
                user.notifyAboutNewMessage();
            }
        }
    }
}
