package main.java.com.synisys.designPatternsTraining.factoryMethod.api;

import main.java.com.synisys.designPatternsTraining.factoryMethod.enums.PizzaType;

/**
 * Created by Razmik on 5/22/2015.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
