package main.java.com.synisys.designPatternsTraining.abstractFactory.impl;

import com.sun.istack.internal.NotNull;
import main.java.com.synisys.designPatternsTraining.abstractFactory.api.Pizza;
import main.java.com.synisys.designPatternsTraining.abstractFactory.api.PizzaIngredientFactory;

/**
 * Created by Razmik on 5/15/2015.
 */
public class ChessPizza extends Pizza {
    @NotNull
    private PizzaIngredientFactory pizzaIngredientFactory;

    public ChessPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("Chess Pizza");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
    }
}
