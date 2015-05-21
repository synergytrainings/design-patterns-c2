package com.synisys.ns;

/**
 * Created by Emil on 5/21/2015.
 */
public interface Sender {

    /**
     *
     * @param notification
     *            Notification
     */
    boolean send(final Notification notification);
}
