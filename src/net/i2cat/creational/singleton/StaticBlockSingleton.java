package net.i2cat.creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;
    private Integer commonInteger = -1;

    private StaticBlockSingleton() {
        System.out.println("::.Constructor.:: The instance has been created");
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void alterCommonInteger() {
        commonInteger += 110;
    }

    public Integer getCommonInteger() {
        return commonInteger;
    }
}
