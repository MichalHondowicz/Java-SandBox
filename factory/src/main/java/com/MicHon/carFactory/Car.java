package com.MicHon.carFactory;

abstract public class Car {

    private int yearOfProduction;
    private int engineSize;
    private String fuelType;
    private WheelPosition wheelPosition;

    public Car(int yearOfProduction, int engineSize, String fuelType, WheelPosition wheelPosition) {
        this.yearOfProduction = yearOfProduction;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.wheelPosition = wheelPosition;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public WheelPosition getWheelPosition() {
        return wheelPosition;
    }
}
