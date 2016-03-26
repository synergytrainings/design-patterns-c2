package api;

import impl.Client;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 26, 2016
 */
public interface Observable {
    void addClient(Client client);

    void removeClient(Client client);

    void notifyAllClients();
}
