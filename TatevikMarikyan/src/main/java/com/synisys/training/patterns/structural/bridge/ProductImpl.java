package com.synisys.training.patterns.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Tatevik.Marikyan
 * @since 12-Jun-15.
 */
public class ProductImpl implements Product {

    private Integer voltage;

    private VoltageChecker voltageChecker;

    public ProductImpl(Integer voltage, Country country) {
        this.voltage = voltage;
        this.voltageChecker = country.createVoltageChecker();
    }

    @Override
    public Integer getVoltage() {
        return voltage;
    }

    @Override
    public boolean hasSuitableVoltage(){
        return this.voltageChecker.isSuitable(this.voltage);
    }
}
