package com.synisys.ns;

/**
 * Created by Emil on 5/21/2015.
 */
public class SmsSender implements Sender {

    private static Sender smsSender = null;

    public static synchronized Sender getInstance() {
        if (smsSender == null) {
            smsSender = new SmsSender();
        }
        return smsSender;
    }

    @Override
    public boolean send(Notification notification) {
        System.out.println("send notification via email");
        return true;
    }
}
