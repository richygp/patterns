package net.i2cat.structural.decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding features of Luxury car.");
    }
}
