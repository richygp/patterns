package net.i2cat.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    public enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE
    }

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
        if (shapeImpl == null) {
            if(type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if(type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if(type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }
}