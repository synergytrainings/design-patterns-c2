package com.synisys.de.rwandaIngo.decorator;

/**
 * Created by Luiza.Karapetyan on 6/23/2015.
 */
public class NuttyDecorator extends IceCreamDecorator {

    public NuttyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    public String makeIceCream() {
        return specialIceCream.makeIceCream() + addNuts();
    }

    private String addNuts() {
        return " + cruncy nuts";
    }
}
