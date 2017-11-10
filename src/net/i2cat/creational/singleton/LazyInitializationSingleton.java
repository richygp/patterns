package net.i2cat.creational.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;
    private Integer commonInteger = -1;

    private LazyInitializationSingleton() {
        System.out.println("::.Constructor.:: The Lazy instance has been initialized");
    }

    public static LazyInitializationSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    public void alterCommonInteger() {
        commonInteger += 510;
    }

    public Integer getCommonInteger() {
        return commonInteger;
    }
}
