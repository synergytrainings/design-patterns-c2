package main.java.com.synisys.designPatternsTraining.factoryMethod.impl;

import main.java.com.synisys.designPatternsTraining.factoryMethod.api.Pizza;
import main.java.com.synisys.designPatternsTraining.factoryMethod.api.PizzaStore;
import main.java.com.synisys.designPatternsTraining.factoryMethod.enums.PizzaType;

/**
 * Created by Razmik on 5/22/2015.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        return new ChicagoStyleChessPizza("", "", "");
    }
}
