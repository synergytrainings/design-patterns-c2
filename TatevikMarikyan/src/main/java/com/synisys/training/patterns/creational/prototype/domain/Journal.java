package com.synisys.training.patterns.creational.prototype.domain;

/**
 * Created by Tatevik
 * since  6/2/2015.
 */
public class Journal extends LibraryItemImpl {

    private String number;

    public Journal(String name) {
        super(name);
    }

    public Journal(String name, String number) {
        super(name);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public Journal clone() throws CloneNotSupportedException {
        Journal clone  = (Journal)super.clone();
        clone.number = this.number;
        return clone;
    }

    @Override
    public String toString() {
        return "[Journal name: " + getName() + ", Journal Number: " + this.number + "]";
    }
}
