/**
 * Created by TikSat on 19.05.2015.
 */
public class SaladFactory extends AbstractMealFactory{
public static final String  YEREVAN_SALAD = "Yerevan";
public static final String  GREECE_SALAD = "Greece";

    @Override
    public Salad getSalad(String name) {
        if(name.equals(YEREVAN_SALAD)){
            return new YerevanSalad();
        }
        if(name.equals(GREECE_SALAD)){
            return new GreeceSalad();
        }
        return null;
    }
}
