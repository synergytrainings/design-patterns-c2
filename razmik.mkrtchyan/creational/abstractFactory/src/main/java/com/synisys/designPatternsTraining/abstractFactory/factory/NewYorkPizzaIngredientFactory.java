package main.java.com.synisys.designPatternsTraining.abstractFactory.factory;

import main.java.com.synisys.designPatternsTraining.abstractFactory.api.Dough;
import main.java.com.synisys.designPatternsTraining.abstractFactory.api.PizzaIngredientFactory;
import main.java.com.synisys.designPatternsTraining.abstractFactory.api.Sauce;
import main.java.com.synisys.designPatternsTraining.abstractFactory.impl.ThickDough;
import main.java.com.synisys.designPatternsTraining.abstractFactory.impl.TomatoSauce;

/**
 * Created by Razmik on 5/15/2015.
 */
public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.print("(thick) ");
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("(tomato) ");
        return new TomatoSauce();
    }


}
