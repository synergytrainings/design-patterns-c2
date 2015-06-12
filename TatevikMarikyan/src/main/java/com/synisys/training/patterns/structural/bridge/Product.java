package com.synisys.training.patterns.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Tatevik.Marikyan
 * @since 12-Jun-15.
 */
public interface Product {

    Integer getVoltage();

    boolean hasSuitableVoltage();
}
