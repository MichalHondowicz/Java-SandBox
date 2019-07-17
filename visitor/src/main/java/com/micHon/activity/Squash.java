package com.micHon.activity;

import com.micHon.visitor.Visitor;

public class Squash implements Activity{

    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
