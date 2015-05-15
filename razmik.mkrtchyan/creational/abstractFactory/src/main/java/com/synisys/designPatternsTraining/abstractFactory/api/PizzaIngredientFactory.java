package main.java.com.synisys.designPatternsTraining.abstractFactory.api;

/**
 * Created by Razmik on 5/15/2015.
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();
}
