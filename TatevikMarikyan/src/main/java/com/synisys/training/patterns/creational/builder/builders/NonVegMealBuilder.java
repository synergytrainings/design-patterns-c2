package com.synisys.training.patterns.creational.builder.builders;

import com.synisys.training.patterns.creational.builder.domain.ChickenBurger;
import com.synisys.training.patterns.creational.builder.domain.Pepsi;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class NonVegMealBuilder extends MealBuilder {
    @Override
    public void addBurger() {
        this.meal.addItem(new ChickenBurger());
    }

    @Override
    public void addDrink() {
        this.meal.addItem(new Pepsi());
    }
}
