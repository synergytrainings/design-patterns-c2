import observable.ObservableData;
import observer.CurrentMeasuresDisplay;
import observer.ForecastDisplay;
import observer.StatisticsDisplay;

public class Main {

	public static void main(String[] args) {
		ObservableData observableData = new ObservableData();

		CurrentMeasuresDisplay currentConditions = new CurrentMeasuresDisplay(observableData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(observableData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(observableData);

		observableData.setMeasurements(80, 65, 20);
		observableData.setMeasurements(82, 70, 21);
		observableData.setMeasurements(78, 90, 22);
	}
}
