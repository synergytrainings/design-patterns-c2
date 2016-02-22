package command.domain;

import command.Macros;
import command.domain.commands.Command;
import command.domain.food.Food;

import java.util.ArrayList;


public class User {
    public ArrayList<Food> foodList;
    String name;
    Macros macros;

    public User(String name) {
        this.name = name;
        foodList = new ArrayList<Food>();
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public Macros getMacros() {
        return macros;
    }

    public void setMacros(Macros macros) {
        this.macros = macros;
    }

    public void getUserOrders(){
        System.out.println("User:" + name);
        macros.execute();
    }
}
