package com.synisys.ns;

/**
 * Created by Emil on 5/21/2015.
 */

public enum TransferType {
    /**
     * When notification should be sent via email
     */
    EMAIL(1),
    /**
     * default notification type
     */
    SYSTEM(2),
    /**
     * When notification should be sent via sms
     */
    SMS(3);

    /**
     * constructor
     *
     * @param id
     *            transfer type id
     */


    private TransferType(int id) {
        this.id = id;
    }

    /**
     * Identifier for transfer Type.
     */
    public final int id;

    /**
     * get Transfer Type By id
     *
     * @param id
     *            Transfer type id
     * @return Transfer type
     */
    public static TransferType getById(int id) {
        switch (id) {
            case 1:
                return SYSTEM;
            case 2:
                return EMAIL;
            case 3:
                return SMS;
            default:
                throw new IllegalArgumentException(String.format("Unknown TransferType Id %s", id));
        }
    }

}

