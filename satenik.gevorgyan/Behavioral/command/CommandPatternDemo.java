package command;

import command.domain.User;
import command.domain.commands.CancelFood;
import command.domain.commands.Command;
import command.domain.commands.OrderFood;
import command.domain.food.Food;
import command.domain.food.Ragoo;
import command.domain.food.Salad;

import java.util.ArrayList;
import java.util.List;


public class CommandPatternDemo {
    public static void main(String[] args) {
        User user1 = new User("Poxos");
        User user2 = new User("Aram");

        Food food1 = new Ragoo();
        Food food2 = new Salad();

        Command orderRagoo = new OrderFood(food1);
        Command orderSalad = new OrderFood(food2);
        Command cancelRagoo = new CancelFood(food1);

        List<Command> user1Commands = new ArrayList<Command>();
        List<Command> user2Commands = new ArrayList<Command>();

        user1Commands.add(orderRagoo);
        user1Commands.add(orderSalad);

        user2Commands.add(orderRagoo);
        user2Commands.add(orderSalad);
        user2Commands.add(cancelRagoo);


        Macros macros1 = new Macros(user1Commands);
        Macros macros2 = new Macros(user2Commands);
        user1.setMacros(macros1);
        user2.setMacros(macros2);


        user1.getUserOrders();
        user2.getUserOrders();
    }
}
