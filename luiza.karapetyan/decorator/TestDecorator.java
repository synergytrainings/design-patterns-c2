package com.synisys.de.rwandaIngo.decorator;

/**
 * Created by Luiza.Karapetyan on 6/23/2015.
 */
public class TestDecorator {

    public static void main(String args[]) {
        IceCream iceCream = new ChocolateDecorator(new NuttyDecorator(new SimpleIceCream()));
        System.out.println(iceCream.makeIceCream());
    }

}
