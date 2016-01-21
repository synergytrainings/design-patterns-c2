package com.synisys.de.peru.proxy;

/**
 * Author: Hasmik Ghazaryan on 1/21/2016.
 */
public class Address {

    private String type;

    private String description;

    private String street;

    private String city;

    private String state;

    private String zipCode;

    public static final String HOME = "home";

    public static final String WORK = "work";

    public Address() {
    }

    public Address(String newDescription, String newStreet, String newCity,
                       String newState, String newZipCode) {
        description = newDescription;
        street = newStreet;
        city = newCity;
        state = newState;
        zipCode = newZipCode;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setType(String newType) {
        type = newType;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public void setStreet(String newStreet) {
        street = newStreet;
    }

    public void setCity(String newCity) {
        city = newCity;
    }

    public void setState(String newState) {
        state = newState;
    }

    public void setZipCode(String newZip) {
        zipCode = newZip;
    }

    public String toString() {
        return description;
    }

    public String getAddress() {
        return description + ", " + street + " " + city + " "
                + " " + state + " " + zipCode;
    }
}
