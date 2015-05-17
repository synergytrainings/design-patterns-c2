package com.synisys.training.patterns.creational.builder.builders;

import com.synisys.training.patterns.creational.builder.domain.Meal;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public abstract class MealBuilder {

    protected Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public void createMeal(){
        this.meal = new Meal();
    }

    public abstract MealBuilder addBurger();

    public abstract MealBuilder addDrink();
}
