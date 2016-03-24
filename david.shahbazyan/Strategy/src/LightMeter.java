import java.math.BigDecimal;

import strategy.api.LightMeterStrategy;

/**
 * Author: David.Shahbazyan Created: Mar 24, 2016
 */
class LightMeter {
	private BigDecimal amount = BigDecimal.ZERO;
	private LightMeterStrategy lightMeterStrategy;

	void incrementAmount() {
		this.amount = lightMeterStrategy.incrementAndGet(amount);
	}

	void printAmount() {
		System.out.println("Amount: $" + amount);
		amount = BigDecimal.ZERO;
	}

	BigDecimal getAmount() {
		return amount;
	}

	void setLightMeterStrategy(LightMeterStrategy lightMeterStrategy) {
		this.lightMeterStrategy = lightMeterStrategy;
	}
}
