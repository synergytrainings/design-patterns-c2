/**
 * Created by TikSat on 19.05.2015.
 */
public class FactoryProducer {
    public static AbstractMealFactory getFactory(){
        return new SaladFactory();
    }
}
