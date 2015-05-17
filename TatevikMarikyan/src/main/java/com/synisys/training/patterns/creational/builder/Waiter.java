package com.synisys.training.patterns.creational.builder;

import com.synisys.training.patterns.creational.builder.builders.MealBuilder;
import com.synisys.training.patterns.creational.builder.domain.Meal;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class Waiter {
    private MealBuilder mealBuilder;

    public Meal getMeal() { return mealBuilder.getMeal(); }

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.createMeal();
        mealBuilder.addBurger();
        mealBuilder.addDrink();
    }
}
