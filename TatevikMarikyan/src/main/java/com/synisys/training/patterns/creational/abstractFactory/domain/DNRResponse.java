package com.synisys.training.patterns.creational.abstractFactory.domain;

import com.synisys.training.patterns.creational.abstractFactory.domain.Response;

import java.util.Date;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class DNRResponse implements Response {

    private Integer id;

    private String personName;

    private Date dateOfBirth;

    public DNRResponse() {
    }

    @Override
    public void printResponseDetails() {
        System.out.println("Response result:");
        System.out.println("Person Name:          " + this.personName);
        System.out.println("Person Date of Birth: " + this.dateOfBirth);

    }

    public DNRResponse(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
