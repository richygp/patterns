package net.i2cat.behavioral.observer;

public interface Subject {

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
    Object getUpdate(Observer obj);

}
