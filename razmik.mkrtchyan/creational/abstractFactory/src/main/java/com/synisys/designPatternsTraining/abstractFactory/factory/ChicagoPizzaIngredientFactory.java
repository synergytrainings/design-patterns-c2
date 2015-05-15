package main.java.com.synisys.designPatternsTraining.abstractFactory.factory;

import main.java.com.synisys.designPatternsTraining.abstractFactory.api.Sauce;
import main.java.com.synisys.designPatternsTraining.abstractFactory.api.Dough;
import main.java.com.synisys.designPatternsTraining.abstractFactory.api.PizzaIngredientFactory;
import main.java.com.synisys.designPatternsTraining.abstractFactory.impl.MozzarellaSauce;
import main.java.com.synisys.designPatternsTraining.abstractFactory.impl.ThinDough;

/**
 * Created by Razmik on 5/15/2015.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.print("(thin) ");
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("(mozzarella) ");
        return new MozzarellaSauce();
    }
}
