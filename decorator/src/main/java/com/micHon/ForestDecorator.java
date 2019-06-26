package com.micHon;

public class ForestDecorator extends TerrainDecorator {

    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int moveCost() {
        return terrain.moveCost() + 5;
    }
}
