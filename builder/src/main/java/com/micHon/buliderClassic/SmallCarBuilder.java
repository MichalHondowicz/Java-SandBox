package com.micHon.buliderClassic;

public class SmallCarBuilder implements CarBuilder {

    private Car car;

    public SmallCarBuilder() {
        this.car = car;
    }

    public void buildWheels() {
        this.car.setWheels("Small");
    }

    public void buildBody() {
        this.car.setBody("Small");
    }

    public void buildEngine() {
        this.car.setEngine("Small");
    }

    public void buildWindows() {
        this.car.setWindows("Small");
    }

    public Car getCar() {
        return car;
    }
}
