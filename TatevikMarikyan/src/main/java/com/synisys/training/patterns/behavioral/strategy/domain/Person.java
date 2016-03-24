package com.synisys.training.patterns.behavioral.strategy.domain;

import java.util.Date;

/**
 * @author Tatevik.Marikyan
 * @since 24-Mar-16.
 */
public class Person {

    private String fullName;

    private Date dateOfBirth;

    private String nib;

    private Integer gender;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNib() {
        return nib;
    }

    public void setNib(String nib) {
        this.nib = nib;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nib='" + nib + '\'' +
                ", gender=" + gender +
                '}';
    }
}
