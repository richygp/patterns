package net.i2cat.creational.abstractFactory.test;

import net.i2cat.creational.abstractFactory.ComputerFactory;
import net.i2cat.creational.abstractFactory.PCFactory;
import net.i2cat.creational.abstractFactory.ServerFactory;
import net.i2cat.creational.abstractFactory.model.Computer;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        System.out.println("Abstract Factory PC Config::" + pc);
        System.out.println("Abstract Factory Server Config::" + server);
    }
}
