package structral.bridge.domain;

import structral.bridge.domain.bridgeInterface.Meat;

/**
 * Created by TikSat on 16.06.2015.
 */
public class CheeseBurger extends Burger{
    private Integer cheeseCalories = Integer.valueOf(50);

    public CheeseBurger(Meat meat) {
        super(meat);
    }

    @Override
    public Integer getCalories() {
        return getMeat().getCalories() + cheeseCalories;
    }

    @Override
    public void getBurgerDetails() {
        System.out.print("This is Cheese burger with " + getMeat().getMeatType() +" meat, and calories for it is following: " + getCalories() + "\n'");
    }
}
