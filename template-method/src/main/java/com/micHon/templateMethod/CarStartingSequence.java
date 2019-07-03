package com.micHon.templateMethod;

public abstract class CarStartingSequence {

    public final void startTheCar() {
        fastenSeatBelts();
        startTheEngine();
        setTheGear();
        go();
    }

    public abstract void setTheGear();

    public abstract void startTheEngine();

    private void fastenSeatBelts() {
        System.out.println("Seat Belts");
    }

    private void go() {
        System.out.println("Go!");
    }
}
