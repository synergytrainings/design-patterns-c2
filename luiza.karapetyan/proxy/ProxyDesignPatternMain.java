package com.synisys.de.rwandaIngo.project.proxy;

/**
 * Created by Luiza.Karapetyan on 1/18/2016.
 */
public class ProxyDesignPatternMain {

    public static void main(String[] args) {
        // If we give correct userName and password
        User user=new User("arpit","arpit");
        FolderProxy folderProxy=new FolderProxy(user);
        System.out.println("When userName and password are correct:");
        folderProxy.performOperations();
        System.out.println("**************************************");
        // if we give wrong userName and Password
        User userWrong=new User("abc","abc");
        FolderProxy folderProxyWrong=new FolderProxy(userWrong);
        System.out.println("When userName and password are incorrect:");
        folderProxyWrong.performOperations();
    }

}