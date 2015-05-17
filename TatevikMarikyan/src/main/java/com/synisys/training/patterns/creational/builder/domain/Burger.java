package com.synisys.training.patterns.creational.builder.domain;

import com.synisys.training.patterns.creational.builder.domain.interfaces.Item;
import com.synisys.training.patterns.creational.builder.domain.interfaces.Packing;

/**
 * Created by Tatevik
 * since  5/17/2015.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
