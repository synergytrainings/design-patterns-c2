package structral.composite.domain;

import java.util.ArrayList;

/**
 * Created by TikSat on 16.06.2015.
 */
public class LunchBox implements Meal{
    private double price;
    private ArrayList<Meal>  lunch = new ArrayList<Meal>();


    public void add(Meal meal){
        this.lunch.add(meal);
    }

    public void remove(Meal meal){
        lunch.remove(meal);
    }

    public void clear(){
        System.out.println("Clearing lunch list");
        this.lunch.clear();
    }

    public String about() {
        StringBuilder str = new StringBuilder();
        for (Meal meal : lunch) {
            str.append("\n" + meal.getType());
        }
        return str.toString();
    }


    @Override
    public String getType() {
        return "Lunch box";
    }

    @Override
    public double getPrice() {
        double totalPrice = this.price;
         for (Meal meal:lunch){
             totalPrice += meal.getPrice();
         }

        return totalPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Meal> getLunch() {
        return lunch;
    }

    public void setLunch(ArrayList<Meal> lunch) {
        this.lunch = lunch;
    }
}
