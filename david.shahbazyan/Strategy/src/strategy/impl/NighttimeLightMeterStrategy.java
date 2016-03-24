package strategy.impl;

import java.math.BigDecimal;

import strategy.api.LightMeterStrategy;

/**
 * Author: David.Shahbazyan Created: Mar 24, 2016
 */
public class NighttimeLightMeterStrategy
		implements LightMeterStrategy {
	private final BigDecimal price = BigDecimal.valueOf(5);

	@Override
	public BigDecimal incrementAndGet(BigDecimal currentAmount) {
		currentAmount = currentAmount == null ? BigDecimal.ZERO : currentAmount; // Prevent NPE in case of passing null value.
		return currentAmount.add(price);
	}
}
