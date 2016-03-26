package api;

import impl.Client;

/**
 * Created by: David.Shahbazyan
 * Created on: Mar 26, 2016
 */
public interface Observer {
    void update(Client sender, String message);
}
