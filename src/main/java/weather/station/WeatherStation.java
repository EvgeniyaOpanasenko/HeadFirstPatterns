package weather.station;

import weather.station.model.CurrentConditionDisplay;
import weather.station.model.StatisticDisplay;
import weather.station.model.WeatherData;

/**
 * Created by User on 8/20/2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        StatisticDisplay currentDisplay =
                new StatisticDisplay(weatherData);
        CurrentConditionDisplay statisticsDisplay = new CurrentConditionDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(90, 75, 40.4f);

    }
}
