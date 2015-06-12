package com.synisys.training.patterns.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Tatevik.Marikyan
 * @since 12-Jun-15.
 */
public enum Country {

    ARM(220) {
        @Override
        public VoltageChecker createVoltageChecker() {
            return new ArmVoltageChecker();
        }
    },
    USA(120) {
        @Override
        public VoltageChecker createVoltageChecker() {
            return new USAVoltageChecker();
        }
    };

    private Country(Integer voltage) {
    }

    public abstract VoltageChecker createVoltageChecker();

    private Integer voltage;

    public Integer getVoltage() {
        return voltage;
    }
}
