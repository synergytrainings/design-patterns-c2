package com.synisys.de.rwandaIngo.iterator;

/**
 * Created by Luiza.Karapetyan on 2/29/2016.
 */
public class Item {

    String name;
    float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + ": $" + price;
    }
}
