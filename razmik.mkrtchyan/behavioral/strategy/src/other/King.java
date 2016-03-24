package other;

import java.lang.*;

/**
 * Created by Razmik on 3/24/2016.
 */
public class King extends Character {


    public King(String name) {
        super(name);
    }

    @Override
    public void description() {
        System.out.println("King name is"+getName());
        getWeaponBehavior().weaponDescription();
    }


}
