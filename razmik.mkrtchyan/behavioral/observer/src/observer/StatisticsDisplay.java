package observer;

import observable.ObservableData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayData {
    private float maxTemp = 0;
    private float minTemp = 20;
    private float tempSum = 0;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof ObservableData) {
            ObservableData observableData = (ObservableData) observable;
            float temp = observableData.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
