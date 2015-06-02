package com.synisys.training.patterns.creational.prototype.domain;

/**
 * Created by Tatevik
 * since  6/2/2015.
 */
public interface LibraryItem extends Cloneable {

    public String getName();

    public LibraryItem clone() throws CloneNotSupportedException;
}
