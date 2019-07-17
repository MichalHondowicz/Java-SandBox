package com.micHon.activity;

public class Treadmill {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public void getCaloriesBurned(){
        System.out.println("Calories burned on treadmill: " + distance*2);
    }
}
