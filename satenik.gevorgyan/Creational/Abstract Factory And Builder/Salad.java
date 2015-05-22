import java.util.ArrayList;

/**
 * Created by TikSat on 15.05.2015.
 */

public  class Salad implements Meal{
    Ingredient tomato;
    Ingredient cucumber;
    ArrayList<Ingredient> ingredients;

    public Salad(){
        tomato = new Ingredient.Builder().price(Double.valueOf(700)).quantity(Double.valueOf(200)).build();
        cucumber = new Ingredient.Builder().price(Double.valueOf(300)).quantity(Double.valueOf(300)).build();
    }

    ArrayList<Ingredient> getIngredients(){
        ingredients = new ArrayList<Ingredient>();
        ingredients.add(tomato);
        ingredients.add(cucumber);
        return ingredients;
    }

    @Override
    public Double getPrice() {
        Double price = Double.valueOf(0);
        for(Ingredient ingredient:getIngredients()) {
            price = price.doubleValue() + ingredient.calculatePriceByQuantity().doubleValue();
        }
        return price;
    }
}
