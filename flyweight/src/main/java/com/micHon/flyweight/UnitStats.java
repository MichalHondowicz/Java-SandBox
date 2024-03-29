package com.micHon.flyweight;

public class UnitStats {

    private String name;
    private int hp;
    private int armor;
    private int damage;
    private int speed;
    private int cost;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmor() {
        return armor;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCost() {
        return cost;
    }

    public UnitStats(String name, int hp, int armor, int damage, int speed, int cost) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.damage = damage;
        this.speed = speed;
        this.cost = cost;
    }
}
