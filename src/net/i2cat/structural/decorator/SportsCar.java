package net.i2cat.structural.decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding features of Sports car.");
    }
}
