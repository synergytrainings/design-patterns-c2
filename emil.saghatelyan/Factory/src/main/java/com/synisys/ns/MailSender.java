package com.synisys.ns;

/**
 * Created by Emil on 5/21/2015.
 */
public class MailSender implements Sender {

    private static Sender mailSender = null;
    private MailSender(){}

    public static synchronized Sender getInstance() {
        if (mailSender == null) {
            mailSender = new MailSender();
        }
        return mailSender;
    }
    @Override
    public boolean send(Notification notification) {
        System.out.println("send notification via email");
        return true;
    }
}
