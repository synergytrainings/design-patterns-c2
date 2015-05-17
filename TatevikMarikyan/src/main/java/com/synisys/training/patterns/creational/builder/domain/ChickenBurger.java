package com.synisys.training.patterns.creational.builder.domain;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 30.5f;
    }
}
