package io.moster.observer;

import io.moster.observer.builtin.WeatherDataObservable;
import io.moster.observer.custom.*;

/**
 * WeatherStation applies the OBSERVER design pattern.
 * <p>
 * The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of
 * its dependents are notified and updated automatically.
 * <p>
 * - Freeman, Eric. Head First Design Patterns (p. 111). O'Reilly Media. Kindle Edition.
 *
 * @author Jalo Moster <jlvmoster@gmail.com>
 * @version 1.0
 * @since 10/9/2020
 */
public class WeatherStation {
    public static void main(String[] args) {
        // Using custom observer pattern
        System.out.println("Started custom observers...");
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDataSubject);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDataSubject);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherDataSubject);

        weatherDataSubject.setMeasurements(80, 65, 30.4f);
        weatherDataSubject.setMeasurements(82, 70, 29.2f);
        weatherDataSubject.setMeasurements(78, 90, 29.2f);

        // Using Java built-in observable
        System.out.println("Started built-in observables...");
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();

        io.moster.observer.builtin.CurrentConditionsDisplay currentConditionsDisplay = new io.moster.observer.builtin.CurrentConditionsDisplay(weatherDataObservable);

        weatherDataObservable.setMeasurements(80, 65, 30.4f);
        weatherDataObservable.setMeasurements(82, 70, 29.2f);
        weatherDataObservable.setMeasurements(78, 90, 29.2f);
    }
}
