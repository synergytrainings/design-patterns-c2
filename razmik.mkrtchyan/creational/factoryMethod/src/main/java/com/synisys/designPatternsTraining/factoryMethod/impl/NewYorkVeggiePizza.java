package main.java.com.synisys.designPatternsTraining.factoryMethod.impl;

import main.java.com.synisys.designPatternsTraining.factoryMethod.api.Pizza;

/**
 * Created by Razmik on 5/22/2015.
 */
public class NewYorkVeggiePizza extends Pizza {


    public NewYorkVeggiePizza(String name, String sauce, String dough) {
        super(name, sauce, dough);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 300");
    }

    @Override
    public void cut() {
        System.out.println("Cut into square");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in PizzaStore box");
    }
}
