package strategy.api;

import java.math.BigDecimal;

/**
 * Author: David.Shahbazyan Created: Mar 24, 2016
 */
public interface LightMeterStrategy {
	BigDecimal incrementAndGet(BigDecimal currentAmount);
}
