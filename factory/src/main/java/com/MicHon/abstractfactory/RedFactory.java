package com.MicHon.abstractfactory;

public class RedFactory extends Factory {

    public NavalUnit createNavalUnit(UnitType unitType) {

        switch (unitType) {
            case SUBMARINE:
                return new Submarine(100, 90, 200);
            default:
                throw new UnsupportedOperationException("Unknown unit type");
        }
    }

    public AirUnit createAirUnit(UnitType unitType) {

        switch (unitType) {
            case BOMBER:
                return new Bomber(50, 80, 100);
            default:
                throw new UnsupportedOperationException("Unknown unit type");
        }
    }
}
