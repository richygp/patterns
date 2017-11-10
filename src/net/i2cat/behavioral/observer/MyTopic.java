package net.i2cat.behavioral.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class MyTopic implements Subject {

    private String message;
    private boolean changed;
    private final Object mutex = new Object();
    private Set<Observer> observers;

    public MyTopic() {
        this.observers = new LinkedHashSet<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) {
            throw new NullPointerException("Empty observer is not allowed!");
        }
        synchronized(mutex) {
            this.observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized(mutex) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        synchronized(mutex) {
            if(!changed) {
                return;
            }
            this.changed = false;
            for(Observer observer : this.observers) {
                observer.update();
            }
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
