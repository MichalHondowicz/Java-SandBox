package com.MicHon.abstractfactory;

abstract public class Factory {

    abstract public NavalUnit createNavalUnit(UnitType unitType);
    abstract public AirUnit createAirUnit(UnitType unitType);

}
