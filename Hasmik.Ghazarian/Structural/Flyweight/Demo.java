package com.synisys.de.peru.flyweight;

import sun.applet.Main;

import java.util.List;

/**
 * Author: Hasmik Ghazaryan on 12/17/2015.
 */
public class Demo {

    public static void main(String[] args) {
        List<Item> aList = FlyWeightFactory.getItemList("A");
        List<Item> bList = FlyWeightFactory.getItemList("B");
        for (Item item : aList) {
            System.out.print(item.getId() + " " + item.getDescription());
        }
        for (Item item : bList) {
            System.out.print(item.getId() + " " + item.getDescription());
        }
    }
}
