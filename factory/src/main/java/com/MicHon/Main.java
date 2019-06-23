package com.MicHon;

import com.MicHon.factory.Factory;
import com.MicHon.factory.Unit;
import com.MicHon.factory.UnitFactory;
import com.MicHon.factory.UnitType;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit cannon = factory.createUnit(UnitType.CANNON);

    }
}
