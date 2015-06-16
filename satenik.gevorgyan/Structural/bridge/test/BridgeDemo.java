package structral.bridge.test;

import structral.bridge.domain.Burger;
import structral.bridge.domain.CheeseBurger;
import structral.bridge.domain.ClassicBurger;
import structral.bridge.domain.bridgeInterface.BruteMeat;
import structral.bridge.domain.bridgeInterface.ChickenMeat;

/**
 * Created by TikSat on 16.06.2015.
 */
public class BridgeDemo {

    public static void main(String[] args){
        Burger cheeseBurger = new CheeseBurger(new BruteMeat());
        Burger cheeseBurger2 = new CheeseBurger(new ChickenMeat());

        Burger classicBurger = new ClassicBurger(new BruteMeat());
        Burger classicBurger2 = new ClassicBurger(new ChickenMeat());

        cheeseBurger.getBurgerDetails();
        cheeseBurger2.getBurgerDetails();
        classicBurger.getBurgerDetails();
        classicBurger2.getBurgerDetails();

    }
}
