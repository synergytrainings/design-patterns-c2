package structral.bridge.domain;

import structral.bridge.domain.bridgeInterface.Meat;

/**
 * Created by TikSat on 16.06.2015.
 */
public abstract class Burger {
    private Meat meat;

    protected Burger(Meat meat) {
        this.meat = meat;
    }

    public abstract Integer getCalories();
    public abstract void getBurgerDetails();

    public Meat getMeat() {
        return meat;
    }


}
