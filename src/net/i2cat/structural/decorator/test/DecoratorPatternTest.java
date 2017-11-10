package net.i2cat.structural.decorator.test;

import net.i2cat.structural.decorator.BasicCar;
import net.i2cat.structural.decorator.Car;
import net.i2cat.structural.decorator.LuxuryCar;
import net.i2cat.structural.decorator.SportsCar;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n******");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
