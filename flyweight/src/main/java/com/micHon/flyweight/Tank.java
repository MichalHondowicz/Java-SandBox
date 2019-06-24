package com.micHon.flyweight;

public class Tank {

    private int x;
    private int y;
    private int hpLeft;

    private TankUnitStats tankUnitStats;

    public Tank(int x, int y) {
        tankUnitStats = UnitStatsRepository.getTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = tankUnitStats.getHp();
    }
}
