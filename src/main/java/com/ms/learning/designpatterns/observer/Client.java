package com.ms.learning.designpatterns.observer;


import java.util.Observable;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/9 9:29
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject(10,20);
        Observer myObserver = new MyObserver();
        Observer otherObserver = new OtherObserver();
        subject.registryObserver(myObserver);
        subject.registryObserver(otherObserver);
        subject.notifyObservers();

    }
}
