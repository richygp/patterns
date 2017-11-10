package net.i2cat.creational.singleton;

public class BillPughSingleton {

    private Integer commonInteger = -1;

    private BillPughSingleton() {
        System.out.println("::.Constructor.:: The Bill Pugh instance has been initialized");
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void alterCommonInteger() {
        commonInteger += 910;
    }

    public Integer getCommonInteger() {
        return commonInteger;
    }
}
