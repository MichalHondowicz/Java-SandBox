package com.MicHon;

import com.MicHon.units.Factory;
import com.MicHon.units.Unit;
import com.MicHon.units.UnitFactory;
import com.MicHon.units.UnitType;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit cannon = factory.createUnit(UnitType.CANNON);

    }
}
