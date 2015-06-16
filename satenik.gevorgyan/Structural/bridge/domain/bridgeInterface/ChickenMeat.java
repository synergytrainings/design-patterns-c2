package structral.bridge.domain.bridgeInterface;

import structral.bridge.MEAT_TYPES;

/**
 * Created by TikSat on 16.06.2015.
 */
public class ChickenMeat implements Meat{

    @Override
    public Integer getCalories() {
        return Integer.valueOf(100);
    }

    @Override
    public String getMeatType() {
        return MEAT_TYPES.CHICKEN.getTypeName();
    }
}
