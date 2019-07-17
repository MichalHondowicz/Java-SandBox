package com.micHon.visitor;

import com.micHon.activity.Gym;
import com.micHon.activity.Squash;
import com.micHon.activity.Treadmill;

public class VisitorImpl implements Visitor {

    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned on treadmill: " + treadmill.getDistance() * 20);
    }

    public void visit(Squash squash) {
        System.out.println("Calories burned with squash: " + squash.getMinutesPlayed() * 4);
    }

    public void visit(Gym gym) {
        System.out.println("Calories burned at gym: " + gym.getWeight() * 5);
    }
}
