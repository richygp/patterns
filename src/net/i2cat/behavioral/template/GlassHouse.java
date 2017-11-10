package net.i2cat.behavioral.template;

public class GlassHouse extends HouseTemplate {
    @Override
    protected void buildWalls() {
        System.out.println("Building Glass Walls.");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with Glass coating.");
    }
}
