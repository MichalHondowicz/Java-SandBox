package com.MicHon.units;

public abstract class Unit {

    private int hp;
    private int exp;
    private int damage;

    protected Unit(int hp, int exp, int damage) {
        this.hp = hp;
        this.exp = exp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDamage() {
        return damage;
    }
}
