package com.MicHon;


import com.MicHon.abstractfactory.*;

public class Main {

    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        AirUnit redBomber = redFactory.createAirUnit(UnitType.BOMBER);
        AirUnit blueBomber = blueFactory.createAirUnit(UnitType.BOMBER);
        NavalUnit redSubmarine = redFactory.createNavalUnit(UnitType.SUBMARINE);
        NavalUnit blueSubmarine = blueFactory.createNavalUnit(UnitType.SUBMARINE);
    }
}
