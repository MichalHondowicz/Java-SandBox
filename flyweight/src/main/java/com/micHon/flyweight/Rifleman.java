package com.micHon.flyweight;

public class Rifleman {

    private int x;
    private int y;
    private int hpLeft;

    RiflemanUnitStats riflemanUnitStats;

    public Rifleman(int x, int y) {
        riflemanUnitStats = UnitStatsRepository.getRiflemanStats();
        this.x = x;
        this.y = y;
        this.hpLeft = riflemanUnitStats.getHp();
    }
}

