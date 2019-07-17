package com.micHon.activity;

public class Gym {

    private int weight;

    public Gym(int weight) {
        this.weight = weight;
    }

    public void getCaloriesBurned() {
        System.out.println("Calories burned at gym: " + weight * 5);
    }
}
