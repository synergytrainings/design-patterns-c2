package com.synisys.training.patterns.creational.builder.builders;

import com.synisys.training.patterns.creational.builder.domain.ChickenBurger;
import com.synisys.training.patterns.creational.builder.domain.Pepsi;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class NonVegMealBuilder extends MealBuilder {
    @Override
    public NonVegMealBuilder addBurger() {
        this.meal.addItem(new ChickenBurger());
        return this;
    }

    @Override
    public NonVegMealBuilder addDrink() {
        this.meal.addItem(new Pepsi());
        return this;
    }
}
