package com.synisys.ns;

/**
 * Created by Emil on 5/21/2015.
 */
public class SystemSender implements Sender {
    @Override
    public boolean send(Notification notification) {
        System.out.println("save notification in DB");
        return true;
    }
}
