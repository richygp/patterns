package net.i2cat.creational.builder.test;

import net.i2cat.creational.builder.Computer;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer
                .ComputerBuilder("500 GB", "8 GB", "2.9 GHz")
                .setBluetoothEnabled(false)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(computer);
    }
}
