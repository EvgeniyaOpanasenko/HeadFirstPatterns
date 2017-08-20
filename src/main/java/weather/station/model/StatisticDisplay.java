package weather.station.model;

import weather.station.model.intarfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, DisplayElement {

    Observable observable;

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;


    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;

        }
    }

    @Override
    public void display() {

    }
}
