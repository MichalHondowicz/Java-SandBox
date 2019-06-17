package com.micHon.buliderClassic;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void buildCar(){
        carBuilder.buildBody();
        carBuilder.buildWheels();
        carBuilder.buildEngine();
        carBuilder.buildWindows();
    }

    public Car getCar(){
        return this.carBuilder.getCar();
    }
}
