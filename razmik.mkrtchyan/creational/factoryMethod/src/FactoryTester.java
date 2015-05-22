import main.java.com.synisys.designPatternsTraining.factoryMethod.api.Pizza;
import main.java.com.synisys.designPatternsTraining.factoryMethod.enums.PizzaType;
import main.java.com.synisys.designPatternsTraining.factoryMethod.impl.NewYorkPizzaStore;

/**
 * Created by Razmik on 5/15/2015.
 */
public class FactoryTester {


    public static void main(String[] args) {
        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        Pizza pizza = newYorkPizzaStore.orderPizza(PizzaType.CHESS);
    }


}
