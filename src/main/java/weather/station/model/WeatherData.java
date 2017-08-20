package weather.station.model;

import weather.station.model.intarfaces.Observer;
import weather.station.model.intarfaces.Subject;

import java.util.ArrayList;

/**
 * Created by User on 8/20/2017.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observersList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observersList = new ArrayList<>();
    }

    public WeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurmentChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void mesurmentChange() {
        notifyObservers();
    }

    public ArrayList<Observer> getObserversList() {
        return observersList;
    }

    public void setObserversList(ArrayList<Observer> observersList) {
        this.observersList = observersList;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurmentChange();
    }
}
