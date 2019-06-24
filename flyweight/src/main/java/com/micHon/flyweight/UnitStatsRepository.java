package com.micHon.flyweight;

public class UnitStatsRepository {

    private static UnitStats carrierUnitStats = new UnitStats("Enterprise", 10000, 10000, 10000, 10, 10000000);

    private static UnitStats riflemanUnitStats = new UnitStats("Redcoat", 60, 20, 30, 10, 10);

    private static UnitStats unitStats = new UnitStats("Tiger", 1000, 1000, 500, 50, 10000);

    private UnitStatsRepository() {
    }

    public static UnitStats getCarrierStats() {
        return carrierUnitStats;
    }

    public static UnitStats getRiflemanStats() {
        return riflemanUnitStats;
    }

    public static UnitStats getTankStats() {
        return unitStats;
    }
}
