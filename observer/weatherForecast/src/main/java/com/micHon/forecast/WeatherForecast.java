package com.micHon.forecast;

import com.micHon.messager.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>();


    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }


    public void notifyObservers() {

        for (Observer observer: registeredObservers)
        {
            observer.updateForecast(this);
        }
    }
}
