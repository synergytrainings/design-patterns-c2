package observer;

import observable.ObservableData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayData {
	private float currentPressure = 29;
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof ObservableData) {
			ObservableData observableData = (ObservableData)observable;
			lastPressure = currentPressure;
			currentPressure = observableData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
