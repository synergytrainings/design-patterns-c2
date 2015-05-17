package com.synisys.training.patterns.creational.builder;

import com.synisys.training.patterns.creational.builder.builders.MealBuilder;
import com.synisys.training.patterns.creational.builder.builders.NonVegMealBuilder;
import com.synisys.training.patterns.creational.builder.builders.VegMealBuilder;
import com.synisys.training.patterns.creational.builder.domain.Meal;

/**
 * Created by Tatevik
 * since  5/18/2015.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        // non Vegetarian Meal Building Process
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        waiter.setMealBuilder(nonVegMealBuilder);
        waiter.constructMeal();
        Meal nonVegMeal = waiter.getMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        // Vegetarian Meal Building Process
        MealBuilder vegMealBuilder = new VegMealBuilder();

        waiter.setMealBuilder(vegMealBuilder);
        waiter.constructMeal();
        Meal vegMeal = waiter.getMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
    }
}
