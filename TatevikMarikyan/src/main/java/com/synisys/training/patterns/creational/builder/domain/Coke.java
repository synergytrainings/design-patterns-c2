package com.synisys.training.patterns.creational.builder.domain;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "CokeCola";
    }

    @Override
    public float price() {
        return 10.2f;
    }
}
