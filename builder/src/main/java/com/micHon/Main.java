package com.micHon;

import com.micHon.airLineBuilder.FlightLeg;

public class Main {

    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightLogBuilder("Warsaw", "Helsinki").buildPrice("100").build();
        FlightLeg leg1 = new FlightLeg.FlightLogBuilder("Warsaw", "Helsinki").build();

        System.out.println(leg1);
        System.out.println(leg);

    }
}
