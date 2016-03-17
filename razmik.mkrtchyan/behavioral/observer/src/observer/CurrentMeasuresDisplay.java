package observer;

import observable.ObservableData;

import java.util.Observable;
import java.util.Observer;
	
public class CurrentMeasuresDisplay implements Observer, DisplayData {
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentMeasuresDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof ObservableData) {
			ObservableData observableData = (ObservableData)obs;
			this.temperature = observableData.getTemperature();
			this.humidity = observableData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
