package com.micHon.buliderClassic;

public class BigCarBuilder implements CarBuilder {

    private Car car;

    public BigCarBuilder() {
        this.car = car;
    }

    public void buildWheels() {
        this.car.setWheels("Big");
    }

    public void buildBody() {
        this.car.setBody("Big");
    }

    public void buildEngine() {
        this.car.setEngine("Big");
    }

    public void buildWindows() {
        this.car.setWindows("Big");
    }

    public Car getCar() {
        return car;
    }
}

