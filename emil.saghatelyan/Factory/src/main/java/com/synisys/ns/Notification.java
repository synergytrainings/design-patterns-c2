package com.synisys.ns;

import java.util.Date;
import java.util.EnumSet;

/**
 * Created by Emil on 5/21/2015.
 */
public class Notification {
    /**
     * Notification Id
     */
    private Integer id;
    /**
     * Notification transfer types
     */
    private EnumSet<TransferType> transferTypes;
    /**
     * Notification from user Id
     */
    private int fromUserId;
    /**
     * Notification to user Id
     */
    private int toUserId;
    /**
     * Notification send date
     */
    private Date sendDate;

    /**
     * Notification subject
     */
    private String subject;
    /**
     * Notification body
     */
    private String body;
    /**
     * is read Notification
     */
    private boolean isRead;

    public Notification() {
    }

    /**
     * Constructor
     *
     * @param id
     *            Notification Id
     * @param transferTypes
     *            Notification transfer types
     * @param fromUserId
     *            Notification from user Id
     * @param toUserId
     *            Notification to user Id
     * @param sendDate
     *            Notification send date
     * @param subject
     *            Notification subject
     * @param body
     *            Notification subject
     * @param isRead
     *            is read Notification
     */
    public Notification(Integer id, EnumSet<TransferType> transferTypes, int fromUserId, int toUserId, Date sendDate,
                        String subject, String body, boolean isRead) {
        this.id = id;
        this.transferTypes = transferTypes;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.sendDate = sendDate;
        this.subject = subject;
        this.body = body;
        this.isRead = isRead;
    }

    /**
     * Get notification id
     *
     * @return notification id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set Notification Id
     *
     * @param id
     *            Notification id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Is read notification
     *
     * @return Is read notification
     */
    public boolean isRead() {
        return isRead;
    }

    /**
     * Set is read notification
     *
     * @param isRead
     *            is read notification
     */
    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * get notification transfer types
     *
     * @return notification transfer types
     */
    public EnumSet<TransferType> getTransferTypes() {
        return transferTypes;
    }

    /**
     * Set Notification transfer types
     *
     * @param transferTypes
     *            Notification transfer types
     */
    public void setTransferTypes(EnumSet<TransferType> transferTypes) {
        this.transferTypes = transferTypes;
    }

    /**
     * Get Notification From user Id
     *
     * @return Notification From user Id
     */
    public int getFromUserId() {
        return fromUserId;
    }

    /**
     * set Notification from user id
     *
     * @param fromUserId
     *            Notification from user id
     */
    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    /**
     * get Notification Send date
     *
     * @return Notification Send date
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * Set Notification send date
     *
     * @param sendDate
     *            Notification send date
     */
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * Get Notification Subject
     *
     * @return Notification Subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Set Notification Subject
     *
     * @param subject
     *            Notification Subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Get Notification Body
     *
     * @return Notification Body
     */
    public String getBody() {
        return body;
    }

    /**
     * Set Notification Body
     *
     * @param body
     *            Notification Body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Get Notification To User Id
     *
     * @return Notification To User Id
     */
    public int getToUserId() {
        return toUserId;
    }

    /**
     * Set notification to User Id
     *
     * @param toUserId
     *            notification to User Id
     */
    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }
}
