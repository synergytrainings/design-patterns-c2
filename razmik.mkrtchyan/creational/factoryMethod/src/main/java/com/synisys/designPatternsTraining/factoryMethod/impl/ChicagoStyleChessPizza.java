package main.java.com.synisys.designPatternsTraining.factoryMethod.impl;

import main.java.com.synisys.designPatternsTraining.factoryMethod.api.Pizza;

/**
 * Created by Razmik on 5/22/2015.
 */
public class ChicagoStyleChessPizza extends Pizza {


    public ChicagoStyleChessPizza(String name, String sauce, String dough) {
        super(name, sauce, dough);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    @Override
    public void cut() {
        System.out.println("Cut into diagonal");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in PizzaStore box");
    }
}
