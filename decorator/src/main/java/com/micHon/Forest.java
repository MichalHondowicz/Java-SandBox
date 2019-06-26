package com.micHon;

public class Forest extends TerrainDecorator {

    public Forest(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int moveCost() {
        return terrain.moveCost() + 5;
    }
}
