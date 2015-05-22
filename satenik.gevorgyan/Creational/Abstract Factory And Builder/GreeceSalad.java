import java.util.ArrayList;

/**
 * Created by TikSat on 15.05.2015.
 */
public class GreeceSalad extends Salad{
    Ingredient cheese;

    GreeceSalad(){
    cheese = new Ingredient.Builder().price(Double.valueOf(1500)).quantity(Double.valueOf(100)).build();
    }

    @Override
    ArrayList<Ingredient> getIngredients() {
        ArrayList<Ingredient> returnList = super.getIngredients();
        returnList.add(cheese);
        return returnList;
    }

}
