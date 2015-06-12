package com.synisys.training.patterns.structural.bridge;

/**
 * @author Tatevik.Marikyan
 * @since 12-Jun-15.
 */
public class BridgeDemo {

    public static void main(String[] args) {

        Product product = new ProductImpl(120, Country.ARM);
        System.out.println("IsSuitable Voltage: " + product.hasSuitableVoltage());
    }
}
