package com.synisys.ns;

/**
 * Created by Emil on 5/21/2015.
 */
public class SmsSender implements Sender {
    @Override
    public boolean send(Notification notification) {
        System.out.println("send notification via email");
        return true;
    }
}
