package com.synisys.training.patterns.creational.builder.domain;

import com.synisys.training.patterns.creational.builder.domain.interfaces.Packing;

/**
 * Created by Tatevik
 * since  5/17/2015.
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
