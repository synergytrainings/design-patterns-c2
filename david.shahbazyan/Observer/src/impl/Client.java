package impl;

import api.Observer;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 26, 2016
 */
public class Client implements Observer {
    private final int uid;
    private final String clientName;

    public Client(int uid) {
        this.uid = uid;
        this.clientName = "Client_" + uid;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public void update(Client sender, String message) {
        System.out.println("[" + clientName + "] -> " + sender.getClientName() + " says: " + message);
    }
}
