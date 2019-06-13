package com.micHon;

import com.micHon.forecast.WeatherForecast;
import com.micHon.messager.InternetNews;
import com.micHon.messager.RadioNews;
import com.micHon.messager.TVNews;

public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast();
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TVNews tvNews = new TVNews();

        weatherForecast.setPressure(100);
        weatherForecast.setTemperature(10);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);

    }

}
