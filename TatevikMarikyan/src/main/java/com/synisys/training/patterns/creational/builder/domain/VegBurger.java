package com.synisys.training.patterns.creational.builder.domain;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
