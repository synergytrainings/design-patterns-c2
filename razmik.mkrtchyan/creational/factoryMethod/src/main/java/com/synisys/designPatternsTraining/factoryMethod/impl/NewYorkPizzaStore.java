package main.java.com.synisys.designPatternsTraining.factoryMethod.impl;

import main.java.com.synisys.designPatternsTraining.factoryMethod.api.Pizza;
import main.java.com.synisys.designPatternsTraining.factoryMethod.api.PizzaStore;
import main.java.com.synisys.designPatternsTraining.factoryMethod.enums.PizzaType;

/**
 * Created by Razmik on 5/22/2015.
 */
public class NewYorkPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        if (PizzaType.CHESS.equals(type)) {
            return new NewYorkStyleChessPizza("CHessPizza", "some sauce", "some ...");
        }
        if (PizzaType.VEGGIE.equals(type)) {
            return new NewYorkVeggiePizza("CHessPizza", "some sauce", "some ...");
        }
         throw new NoSuchFieldError("There are not pizza with " + type + " name");
    }
}
