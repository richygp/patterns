package net.i2cat.behavioral.observer;

public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if(message == null) {
            System.out.println(name + "..:: No message consumed ::..");
        } else {
            System.out.println(name + "..:: Message: " + message + " ::..");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
