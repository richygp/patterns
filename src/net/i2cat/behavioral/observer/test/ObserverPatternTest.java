package net.i2cat.behavioral.observer.test;

import net.i2cat.behavioral.observer.MyTopic;
import net.i2cat.behavioral.observer.MyTopicSubscriber;
import net.i2cat.behavioral.observer.Observer;

public class ObserverPatternTest {

    public static void main(String[] args) {

        MyTopic myTopic = new MyTopic();

        Observer observer1 = new MyTopicSubscriber("Observer 1");
        Observer observer2 = new MyTopicSubscriber("Observer 2");
        Observer observer3 = new MyTopicSubscriber("Observer 3");

        myTopic.register(observer1);
        myTopic.register(observer2);
        myTopic.register(observer3);

        observer1.setSubject(myTopic);
        observer2.setSubject(myTopic);
        observer3.setSubject(myTopic);

        observer1.update();

        myTopic.postMessage("New Message");
    }
}
