package com.synisys.training.patterns.creational.prototype.domain;

/**
 * Created by Tatevik
 * since  6/2/2015.
 */
public class LibraryItemImpl implements LibraryItem {

    private String name;

    public LibraryItemImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public LibraryItem clone() throws CloneNotSupportedException {
        LibraryItem clone = (LibraryItemImpl) super.clone();
        return clone;
    }
}
