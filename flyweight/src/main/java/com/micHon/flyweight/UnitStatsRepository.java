package com.micHon.flyweight;

public class UnitStatsRepository {

    private static CarrierUnitStats carrierUnitStats = new CarrierUnitStats("Enterprise",10000,10000,10000,10, 10000000);

    public static CarrierUnitStats getCarrierStats(){
        return carrierUnitStats;
    }
}
