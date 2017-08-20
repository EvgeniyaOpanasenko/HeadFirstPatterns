package weather.station.model.intarfaces;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
