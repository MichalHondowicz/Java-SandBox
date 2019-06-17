package com.micHon;

import com.micHon.house.House;

public class Main {

    public static void main(String[] args) {

        House house = new House.HouseBuilder().buildDoors("Doors").buildFloors("Floors").build();
    }
}
