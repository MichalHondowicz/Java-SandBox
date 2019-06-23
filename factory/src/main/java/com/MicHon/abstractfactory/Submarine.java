package com.MicHon.abstractfactory;

public class Submarine extends Unit {

    private int hp;
    private int exp;
    private int damage;

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getExp() {
        return exp;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    protected Submarine(int hp, int exp, int damage) {
        super(hp, exp, damage);
    }
}