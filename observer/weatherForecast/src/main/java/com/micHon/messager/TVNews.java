package com.micHon.messager;

import com.micHon.forecast.WeatherForecast;

public class TVNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV News: Temp: " + weatherForecast.getTemperature() + " Pressure: " + weatherForecast.getPressure());
    }
}
