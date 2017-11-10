package net.i2cat.creational.singleton.test;

import net.i2cat.creational.singleton.SerializedSingleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hasCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hasCode=" + instanceTwo.hashCode());
    }
}
