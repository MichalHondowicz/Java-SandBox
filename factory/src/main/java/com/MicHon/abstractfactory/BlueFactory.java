package com.MicHon.abstractfactory;

public class BlueFactory extends Factory {

    public NavalUnit createNavalUnit(UnitType unitType) {
        switch (unitType) {
            case SUBMARINE:
                return new Submarine(110, 60, 280);
            default:
                throw new UnsupportedOperationException("Unknown unit type");
        }
    }

    public AirUnit createAirUnit(UnitType unitType) {

        switch (unitType) {
            case BOMBER:
                return new Bomber(80, 30, 300);
            default:
                throw new UnsupportedOperationException("Unknown unit type");
        }
    }
}
