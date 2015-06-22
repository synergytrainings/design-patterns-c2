package com.synisys.training.patterns.structural.decorator.domain;

/**
 * Created by Tatevik
 * since  6/23/2015.
 */
public class EntityImpl implements Entity{

    private Integer id;

    public EntityImpl(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public EntityImpl clone() throws CloneNotSupportedException {
        return (EntityImpl) super.clone();
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
