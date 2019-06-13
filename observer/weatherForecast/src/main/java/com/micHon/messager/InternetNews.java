package com.micHon.messager;

import com.micHon.forecast.WeatherForecast;

public class InternetNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet News: Temp: " + weatherForecast.getTemperature() + " Pressure: " + weatherForecast.getPressure());
    }
}
