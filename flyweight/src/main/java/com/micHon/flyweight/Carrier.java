package com.micHon.flyweight;

public class Carrier {

    private CarrierUnitStats stats;
    private int x;
    private int y;
    private int hpLeft;

    public Carrier(int x, int y) {
        stats = UnitStatsRepository.getCarrierStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
