package com.micHon.messager;

import com.micHon.forecast.WeatherForecast;

public class RadioNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio News: Temp: " + weatherForecast.getTemperature() + " Pressure: " + weatherForecast.getPressure());

    }
}
