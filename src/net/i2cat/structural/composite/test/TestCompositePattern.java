package net.i2cat.structural.composite.test;

import net.i2cat.structural.composite.Circle;
import net.i2cat.structural.composite.Drawing;
import net.i2cat.structural.composite.Shape;
import net.i2cat.structural.composite.Triangle;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
