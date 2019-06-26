package com.micHon;

public class River extends TerrainDecorator {

    public River(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int moveCost() {
        return terrain.moveCost() + 10;
    }
}
