package com.MicHon;


import com.MicHon.abstractfactory.*;
import com.MicHon.carFactory.*;
import com.MicHon.carFactory.Factory;

public class Main {

    public static void main(String[] args) {

        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.createBMW(CarModel.E60);
        Car ford = continentalFactory.createFord(CarModel.FOCUS);

        System.out.println(ford.getWheelPosition());
        System.out.println(bmw.getWheelPosition());
    }
}
