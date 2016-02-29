package command.domain.commands;

import command.domain.User;
import command.domain.food.Food;


public class CancelFood implements Command {

    private Food food;

    public CancelFood(Food food) {
        this.food = food;
    }

    @Override
    public void execute() {
        this.food.setAvailableSatus(false);
        System.out.println("Canceled: " + food.getName());
    }
}
