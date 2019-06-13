package com.micHon.messager;

import com.micHon.forecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
