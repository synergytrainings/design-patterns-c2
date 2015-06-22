package com.synisys.training.patterns.structural.decorator.domain;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public interface Entity extends Cloneable {

    Integer getId();

    public Entity clone() throws CloneNotSupportedException;
}
