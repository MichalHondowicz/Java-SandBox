package com.micHon;

import com.micHon.buliderClassic.BigCarBuilder;
import com.micHon.buliderClassic.Car;
import com.micHon.buliderClassic.CarDirector;
import com.micHon.buliderClassic.SmallCarBuilder;

public class Main {

    public static void main(String[] args) {

        SmallCarBuilder smallCarBuilder = new SmallCarBuilder();
        BigCarBuilder bigCarBuilder = new BigCarBuilder();
        CarDirector smallCarDirector = new CarDirector(smallCarBuilder);
        smallCarDirector.buildCar();
        CarDirector bigCarDirector = new CarDirector(bigCarBuilder);
        bigCarDirector.buildCar();

        Car smallCar = smallCarDirector.getCar();
        Car bigCar = bigCarDirector.getCar();

        System.out.println(smallCar);
        System.out.println(bigCar);
    }
}
