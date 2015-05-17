package com.synisys.training.patterns.creational.builder.domain;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi Cola";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
