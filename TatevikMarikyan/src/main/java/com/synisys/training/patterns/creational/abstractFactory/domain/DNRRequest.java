package com.synisys.training.patterns.creational.abstractFactory.domain;

import com.synisys.training.patterns.creational.abstractFactory.domain.Request;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class DNRRequest implements Request {

    private String nationalIdCard;

    public DNRRequest(String nationalIdCard) {
        this.nationalIdCard = nationalIdCard;
    }

    public String getNationalIdCard() {
        return nationalIdCard;
    }

}
