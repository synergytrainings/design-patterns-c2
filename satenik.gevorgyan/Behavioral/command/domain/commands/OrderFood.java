package command.domain.commands;

import command.domain.User;
import command.domain.food.Food;


public class OrderFood implements Command {
    private Food food;

    public OrderFood(Food food) {
        this.food = food;
    }

    @Override
    public void execute() {
        this.food.setAvailableSatus(false);
        System.out.println("Ordered: " + food.getName());
    }

}
