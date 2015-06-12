package com.synisys.training.patterns.structural.bridge;

/**
 * @author Tatevik.Marikyan
 * @since 12-Jun-15.
 */
public class ArmVoltageChecker implements VoltageChecker {
    @Override
    public boolean isSuitable(Integer voltage) {
        return Country.ARM.getVoltage().equals(voltage);
    }
}
