package com.micHon.adapter;

public class UKToEuroAdapter implements EuroDevice {

    UKDevice device;

    public UKToEuroAdapter(UKDevice device) {
        this.device = device;
    }

    public void on() {
        device.powerOn();
    }
}
