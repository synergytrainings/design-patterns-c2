package com.synisys.de.rwanda.project.flyweight;

/**
 * Created by Luiza.Karapetyan on 12/21/2015.
 */
public class FlyweightDemo {
    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        for (int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            flyweightAdder.doMath(i, i);

            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            flyweightMultiplier.doMath(i, i);
        }
    }
}
