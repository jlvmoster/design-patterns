package io.moster.observer.custom;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum = 0.0f;
    private int readings;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureSum += temperature;
        readings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (temperatureSum / readings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}
