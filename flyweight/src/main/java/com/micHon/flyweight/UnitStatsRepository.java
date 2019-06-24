package com.micHon.flyweight;

public class UnitStatsRepository {

    private static CarrierUnitStats carrierUnitStats = new CarrierUnitStats("Enterprise", 10000, 10000, 10000, 10, 10000000);

    private static RiflemanUnitStats riflemanUnitStats = new RiflemanUnitStats("Redcoat", 60, 20, 30, 10, 10);

    private static TankUnitStats tankUnitStats = new TankUnitStats("Tiger", 1000, 1000, 500, 50, 10000);

    private UnitStatsRepository() {
    }

    public static CarrierUnitStats getCarrierStats() {
        return carrierUnitStats;
    }

    public static RiflemanUnitStats getRiflemanStats(){
        return riflemanUnitStats;
    }

    public static TankUnitStats getTankStats(){
        return tankUnitStats;
    }
}
