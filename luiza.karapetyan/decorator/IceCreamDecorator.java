package com.synisys.de.rwandaIngo.decorator;

/**
 * Created by Luiza.Karapetyan on 6/23/2015.
 */
abstract class IceCreamDecorator implements IceCream {

    protected IceCream specialIceCream;

    public IceCreamDecorator(IceCream specialIceCream) {
        this.specialIceCream = specialIceCream;
    }

    public String makeIceCream() {
        return specialIceCream.makeIceCream();
    }
}
