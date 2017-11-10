package net.i2cat.creational.singleton;

public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();
    private Integer commonInteger = -1;

    private EagerInitialization() {
        System.out.println("::.Constructor.:: Initializing EagerInitialization");
    }

    public static EagerInitialization getInstance() {
        return instance;
    }

    public void alterCommonInteger() {
        commonInteger += 100;
    }

    public Integer getCommonInteger() {
        return commonInteger;
    }
}
