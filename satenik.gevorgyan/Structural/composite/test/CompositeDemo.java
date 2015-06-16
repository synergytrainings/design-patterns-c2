package structral.composite.test;

import structral.composite.domain.*;

/**
 * Created by TikSat on 16.06.2015.
 */
public class CompositeDemo {

    public static void main(String[] args){
        Meal salad = new  Salad(Double.valueOf(500));
        Meal drink = new Drink(Double.valueOf(350));
        Meal snack = new Snack(Double.valueOf(700));
        LunchBox lunchbox = new LunchBox();

        lunchbox.add(salad);
        lunchbox.add(drink);
        lunchbox.add(snack);
        System.out.print("Lunch in detail:" + lunchbox.about() +"\n");
        System.out.print(lunchbox.getType() + " price :" + lunchbox.getPrice());


    }
}
