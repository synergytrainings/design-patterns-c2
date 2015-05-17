package com.synisys.training.patterns.creational.builder.builders;

import com.synisys.training.patterns.creational.builder.domain.Coke;
import com.synisys.training.patterns.creational.builder.domain.VegBurger;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class VegMealBuilder extends MealBuilder {
    @Override
    public VegMealBuilder addBurger() {
        this.meal.addItem(new VegBurger());
        return this;
    }

    @Override
    public VegMealBuilder addDrink() {
        this.meal.addItem(new Coke());
        return this;
    }
}
