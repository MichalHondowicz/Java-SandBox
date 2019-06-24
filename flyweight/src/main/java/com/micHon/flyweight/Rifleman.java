package com.micHon.flyweight;

public class Rifleman {

    private String name;
    private int hp;
    private int armor;
    private int damage;
    private int speed;
    private int x;
    private int cost;
    private int y;
    private int hpLeft;

    public Rifleman(String name, int hp, int armor, int damage, int speed, int x, int cost, int y) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.damage = damage;
        this.speed = speed;
        this.x = x;
        this.cost = cost;
        this.y = y;
    }
}

