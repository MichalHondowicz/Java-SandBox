package com.MicHon.factory;

public class UnitFactory extends Factory {

    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(100, 100, 100);
            case CANNON:
                return new Cannon(50, 100, 150);
            default:
                throw new UnsupportedOperationException("No such type found");
        }
    }
}
