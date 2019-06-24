package com.micHon.flyweight;

public class Tank {

    private int x;
    private int y;
    private int hpLeft;

    private UnitStats unitStats;

    public Tank(int x, int y) {
        unitStats = UnitStatsRepository.getTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = unitStats.getHp();
    }
}
