package impl;

import api.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 26, 2016
 */
public class Channel implements Observable {
    private final int uid;
    private final String channelName;
    private List<Client> clients = new ArrayList<>();
    private Client currentSender;
    private String currentMessage;

    public Channel(int uid) {
        this.uid = uid;
        this.channelName = "Channel_" + uid;
    }

    public String getChannelName() {
        return channelName;
    }

    public List<Client> getClients() {
        return clients;
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    public void sendMessage(Client sender, String message) {
        this.currentSender = sender;
        this.currentMessage = message;
        notifyAllClients();
    }

    @Override
    public void notifyAllClients() {
        for (Client client : clients) {
            client.update(currentSender, currentMessage);
        }
    }
}
