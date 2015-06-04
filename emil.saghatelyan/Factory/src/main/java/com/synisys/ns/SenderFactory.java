package com.synisys.ns;

/**
 * Created by Emil on 5/21/2015.
 */
public class SenderFactory {
    /**
     * factory method which returns sender object of given transfer type
     *
     * @param transferType
     * @return sender object of given transfer type
     */
    public Sender getSender(TransferType transferType) {
        switch (transferType) {
            case EMAIL:
                return  MailSender.getInstance();
            case SYSTEM:
                return  SystemSender.getInstance();
            case SMS:
                return  SmsSender.getInstance();
            default:
                throw new IllegalArgumentException(String.format("Unknown Transfer Type %s", transferType));

        }
    }
}
