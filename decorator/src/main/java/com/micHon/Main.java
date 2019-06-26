package com.micHon;

public class Main {

    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        Terrain terrain0 = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain = new River(new Plain());
        Terrain terrain2 = new Forest(new Hill());
        Terrain terrain3 = new River(new Forest(new Hill()));

        System.out.println(terrain.moveCost());
    }
}
