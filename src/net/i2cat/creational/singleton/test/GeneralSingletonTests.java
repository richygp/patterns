package net.i2cat.creational.singleton.test;

import net.i2cat.creational.singleton.*;

public class GeneralSingletonTests {

    public static void main(String[] args) {
        singletonPattern();
    }

    private static void singletonPattern() {
        // First Approach (and simplest) for using the Singleton Pattern. Eager Initialization.
        EagerInitialization singletonExample = EagerInitialization.getInstance();
        System.out.println(singletonExample.getCommonInteger());
        EagerInitialization otherSingletonExample = EagerInitialization.getInstance();
        otherSingletonExample.alterCommonInteger();
        System.out.println(singletonExample.getCommonInteger());
        System.out.println(otherSingletonExample.getCommonInteger());

        // Second Approach for using Singleton Pattern. Handling the exception while creating.
        // Static Block Initialization.
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton.getCommonInteger());
        StaticBlockSingleton otherStaticBlockSingleton = StaticBlockSingleton.getInstance();
        otherStaticBlockSingleton.alterCommonInteger();
        System.out.println(staticBlockSingleton.getCommonInteger());
        System.out.println(otherStaticBlockSingleton.getCommonInteger());

        // Third Approach for using Singleton Pattern. Lazy Initialization of the instance.
        // Lazy Initialization.
        LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
        System.out.println(lazyInitializationSingleton.getCommonInteger());
        LazyInitializationSingleton otherLazyInitializationSingleton = LazyInitializationSingleton.getInstance();
        otherLazyInitializationSingleton.alterCommonInteger();
        System.out.println(lazyInitializationSingleton.getCommonInteger());
        System.out.println(otherLazyInitializationSingleton.getCommonInteger());

        // Forth Approach for using Singleton Pattern. Thread Safe Initialization of the instance.
        // Thread Safe Initialization.
        ThreadSafeSingleton threadSafeInitialization = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeInitialization.getCommonInteger());
        ThreadSafeSingleton otherThreadSafeInitialization = ThreadSafeSingleton.getInstance();
        otherThreadSafeInitialization.alterCommonInteger();
        System.out.println(threadSafeInitialization.getCommonInteger());
        System.out.println(otherThreadSafeInitialization.getCommonInteger());

        // Fifth Approach for using Singleton Pattern. Bill Pugh approach.
        BillPughSingleton billPughInstance = BillPughSingleton.getInstance();
        System.out.println(billPughInstance.getCommonInteger());
        BillPughSingleton otherBillPughInstance = BillPughSingleton.getInstance();
        otherBillPughInstance.alterCommonInteger();
        System.out.println(billPughInstance.getCommonInteger());
        System.out.println(otherBillPughInstance.getCommonInteger());
    }
}
