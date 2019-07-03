package com.micHon.templateMethod;

public class StartTheClassicCar {

    public void startTheCar(){
        fastenSeatBelts();
        startTheEngine();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Go!");
    }

    private void setTheGear() {

        System.out.println("Gears!");
    }

    private void startTheEngine() {

        System.out.println("Engine!");
    }

    private void fastenSeatBelts() {
        System.out.println("Seat Belts");
    }
}
