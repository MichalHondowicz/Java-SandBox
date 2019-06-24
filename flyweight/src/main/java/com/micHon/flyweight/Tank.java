package com.micHon.flyweight;

public class Tank {

    private String name;
    private int hp;
    private int armor;
    private int damage;
    private int speed;
    private int x;
    private int y;
    private int hpLeft;
    private int cost;

    public Tank(String name, int hp, int armor, int damage, int speed, int x, int y, int cost) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.damage = damage;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.cost = cost;
    }

}
