package com.synisys.de.rwandaIngo.decorator;

/**
 * Created by Luiza.Karapetyan on 6/23/2015.
 */
public class ChocolateDecorator extends IceCreamDecorator {

    public ChocolateDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    public String makeIceCream() {
        return specialIceCream.makeIceCream() + addChocolate();
    }

    private String addChocolate() {
        return " + sweet chocolate";
    }
}