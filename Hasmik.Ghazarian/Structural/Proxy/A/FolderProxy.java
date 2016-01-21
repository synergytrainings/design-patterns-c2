package com.synisys.de.peru.proxy;

/**
 * Author: Hasmik Ghazaryan on 1/18/2016.
 */
public class FolderProxy implements Folder {

    private Folder folder;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    public void performOperations() {

        if(user.getUserName().equalsIgnoreCase("arpit") && user.getPassword().equalsIgnoreCase("arpit")) {
            folder= new FolderImpl();
            folder.performOperations();
        } else {
            System.out.println("You don't have access to this folder");
        }
    }

}
