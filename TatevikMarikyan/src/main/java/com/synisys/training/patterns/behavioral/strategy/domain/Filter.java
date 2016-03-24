package com.synisys.training.patterns.behavioral.strategy.domain;

import java.util.Date;

/**
 * @author Tatevik.Marikyan
 * @since 24-Mar-16.
 */
public class Filter {

    private String nib;

    private Date dateOfBirth;

    public Filter(String nib, Date dateOfBirth) {
        this.nib = nib;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNib() {
        return nib;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
