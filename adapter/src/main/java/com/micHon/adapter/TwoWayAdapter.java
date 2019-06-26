package com.micHon.adapter;

public class TwoWayAdapter implements EuroDevice, UKDevice {

    UKDevice ukDevice;

    EuroDevice euroDevice;

    public TwoWayAdapter(UKDevice ukDevice, EuroDevice euroDevice) {
        this.ukDevice = ukDevice;
        this.euroDevice = euroDevice;
    }

    public void on() {

        ukDevice.powerOn();
    }

    public void powerOn() {

        euroDevice.on();
    }
}
