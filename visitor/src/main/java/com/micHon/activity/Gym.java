package com.micHon.activity;

import com.micHon.visitor.Visitor;

public class Gym implements Activity{

    private int weight;

    public int getWeight() {
        return weight;
    }

    public Gym(int weight) {
        this.weight = weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
