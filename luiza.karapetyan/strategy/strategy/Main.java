package com.synisys.de.rwandaIngo.strategy;

/**
 * Created by Luiza.Karapetyan on 3/24/2016.
 */
public class Main {
    public static void main(String[] args) {
        MathContext context = new MathContext(new MathAdd());
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new MathContext(new MathSubtract());
        System.out.println("10 - 5 = " + context.execute(10, 5));

        context = new MathContext(new MathMultiply());
        System.out.println("10 * 5 = " + context.execute(10, 5));
    }
}
