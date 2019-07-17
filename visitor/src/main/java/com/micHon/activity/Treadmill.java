package com.micHon.activity;

import com.micHon.visitor.Visitor;

public class Treadmill implements Activity {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
