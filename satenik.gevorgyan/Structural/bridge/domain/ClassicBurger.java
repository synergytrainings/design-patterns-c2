package structral.bridge.domain;

import structral.bridge.domain.bridgeInterface.Meat;

/**
 * Created by TikSat on 16.06.2015.
 */
public class ClassicBurger extends Burger {
    private Integer vegetableCalories = Integer.valueOf(10);

    public ClassicBurger(Meat meat) {
        super(meat);
    }

    @Override
    public Integer getCalories() {
        return getMeat().getCalories() + vegetableCalories;
    }

    @Override
    public void getBurgerDetails() {
        System.out.print("This is Classic burger with "+ getMeat().getMeatType() + " meat, and calories for it is following: " + getCalories() + "\n");
    }
}
