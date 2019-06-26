package com.micHon;

public class RoadDecorator extends TerrainDecorator {

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int moveCost() {
        return terrain.moveCost() - 1 ;
    }

    @Override
    public String getDescription() {
        return terrain.getDescription() + " with road";
    }
}
