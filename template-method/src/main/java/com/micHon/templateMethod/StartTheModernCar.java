package com.micHon.templateMethod;

public class StartTheModernCar {


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

        System.out.println("Start/Stop button!");
    }

    private void fastenSeatBelts() {
        System.out.println("Seat Belts");
    }

}
