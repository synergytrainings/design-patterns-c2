import strategy.api.LightMeterStrategy;
import strategy.impl.DaytimeLightMeterStrategy;
import strategy.impl.NighttimeLightMeterStrategy;

/**
 * Author: David.Shahbazyan Created: Mar 24, 2016
 */
public class Main {
	public static void main(String[] args) {
		LightMeter lightMeter = new LightMeter();

		lightMeter.printAmount();

		LightMeterStrategy lightMeterStrategy;
		String dayTime;
		for (int i = 0; i < 24; i += 1) {
			if (i > 6 && i < 20) {
				lightMeterStrategy = new DaytimeLightMeterStrategy();
				dayTime = "DayTime (" + i + ":00)";
			}
			else {
				lightMeterStrategy = new NighttimeLightMeterStrategy();
				dayTime = "NightTime (" + i + ":00)";
			}
			lightMeter.setLightMeterStrategy(lightMeterStrategy);
			lightMeter.incrementAmount();
			System.out.println("[" + dayTime + "] $" + lightMeter.getAmount());
		}

		lightMeter.printAmount();
	}
}
