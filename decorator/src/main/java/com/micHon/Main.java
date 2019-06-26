package com.micHon;

public class Main {

    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        Terrain terrain0 = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain = new RiverDecorator(new Plain());
        Terrain terrain2 = new ForestDecorator(new Hill());
        Terrain terrain4 = new RoadDecorator(new Hill());
        Terrain terrain3 = new RiverDecorator(new ForestDecorator(new Hill()));

        System.out.println(terrain.moveCost());
        System.out.println(terrain3.moveCost());
        System.out.println(terrain4.moveCost());
        System.out.println(terrain4.getDescription());
    }
}
