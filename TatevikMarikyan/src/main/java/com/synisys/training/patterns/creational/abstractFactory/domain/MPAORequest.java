package com.synisys.training.patterns.creational.abstractFactory.domain;

import java.util.Date;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class MPAORequest implements Request {

    private String nationalIdCard;

    private String startDate;

    private String endDate;

    private String key;

    public MPAORequest(String nationalIdCard, String startDate, String endDate, String key) {
        this.nationalIdCard = nationalIdCard;
        this.startDate = startDate;
        this.endDate = endDate;
        this.key = key;
    }

    public String getNationalIdCard() {
        return nationalIdCard;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getKey() {
        return key;
    }
}
