package com.synisys.de.rwandaIngo.project.proxy;

/**
 * Created by Luiza.Karapetyan on 1/18/2016.
 */
public class User {

    String userName;
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}
