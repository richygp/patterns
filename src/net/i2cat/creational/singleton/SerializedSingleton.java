package net.i2cat.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;
    private Integer commonInteger = -1;

    private SerializedSingleton() {
        System.out.println("::.Constructor.:: Serialized Singleton instance has been initialized");
    }

    private static class SingletonHelper {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SerializedSingleton.SingletonHelper.INSTANCE;
    }

    /**
     * This function is a crucial one for preventing of multiple instantiation of this class objects
     * after deserialization.
     * @return the instance of the Singleton Object
     */
    protected Object readResolve() {
        return getInstance();
    }

    public void alterCommonInteger() {
        commonInteger += 910;
    }

    public Integer getCommonInteger() {
        return commonInteger;
    }
}
