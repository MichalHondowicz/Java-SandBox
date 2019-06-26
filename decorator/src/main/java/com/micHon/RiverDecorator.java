package com.micHon;

public class RiverDecorator extends TerrainDecorator {

    public RiverDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int moveCost() {
        return terrain.moveCost() + 10;
    }
}
