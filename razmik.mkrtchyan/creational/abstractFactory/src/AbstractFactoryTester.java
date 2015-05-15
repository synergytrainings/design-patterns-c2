import main.java.com.synisys.designPatternsTraining.abstractFactory.api.Pizza;
import main.java.com.synisys.designPatternsTraining.abstractFactory.factory.ChicagoPizzaIngredientFactory;
import main.java.com.synisys.designPatternsTraining.abstractFactory.factory.NewYorkPizzaIngredientFactory;
import main.java.com.synisys.designPatternsTraining.abstractFactory.impl.ChessPizza;

/**
 * Created by Razmik on 5/15/2015.
 */
public class AbstractFactoryTester {

    public static void main(String[] args) {
        System.out.println("Chicago -");
        prepareChicagoPizzaIngredient();
        System.out.println("New York -");
        prepareNewYorkPizzaIngredient();
    }

    private static void prepareNewYorkPizzaIngredient() {
        Pizza chessPizza = new ChessPizza(new NewYorkPizzaIngredientFactory());
        System.out.print(" " + chessPizza.getName() + " ");
        chessPizza.prepare();
    }

    private static void prepareChicagoPizzaIngredient() {
        Pizza chessPizza = new ChessPizza(new ChicagoPizzaIngredientFactory());
        System.out.print(" " + chessPizza.getName() + " ");
        chessPizza.prepare();
    }
}
