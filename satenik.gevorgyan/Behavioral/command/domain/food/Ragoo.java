package command.domain.food;

import command.domain.food.Food;


public class Ragoo implements Food {
    @Override
    public Integer getAmount() {
        return 1000;
    }

    @Override
    public String getName() {
        return "Ragoo";
    }

    @Override
    public Boolean isAvailable() {
        return true;
    }

    @Override
    public void setAvailableSatus(Boolean status) {

    }
}
