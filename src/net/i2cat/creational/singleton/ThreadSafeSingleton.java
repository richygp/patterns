package net.i2cat.creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private Integer commonInteger = -1;

    private ThreadSafeSingleton() {
        System.out.println("::.Constructor.:: The Thread Safe instance has been initialized");
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void alterCommonInteger() {
        commonInteger += 710;
    }

    public Integer getCommonInteger() {
        return commonInteger;
    }
}
