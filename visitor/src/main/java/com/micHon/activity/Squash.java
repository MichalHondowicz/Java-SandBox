package com.micHon.activity;

public class Squash {

    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public void getCaloriesBurned(){
        System.out.println("Calories burned with squash: "+ minutesPlayed*4);
    }
}
