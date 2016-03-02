package com.synisys.de.rwandaIngo.mediator;

/**
 * Created by Luiza.Karapetyan on 3/2/2016.
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
