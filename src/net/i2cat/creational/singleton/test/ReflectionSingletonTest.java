package net.i2cat.creational.singleton.test;

import net.i2cat.creational.singleton.EagerInitialization;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitialization eagerOne = EagerInitialization.getInstance();
        EagerInitialization eagerTwo = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                constructor.setAccessible(true);
                eagerTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(eagerOne.hashCode());
        assert eagerTwo != null;
        System.out.println(eagerTwo.hashCode());
    }
}
