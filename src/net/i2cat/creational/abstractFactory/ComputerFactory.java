package net.i2cat.creational.abstractFactory;

import net.i2cat.creational.abstractFactory.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
