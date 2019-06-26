package com.micHon;

abstract public class Terrain {

    private String description;
    private int moveCost;

    public Terrain(String description, int moveCost) {
        this.description = description;
        this.moveCost = moveCost;
    }

    public int moveCost(){
        return moveCost;
    }

    public String getDescription() {
        return description;
    }
}
