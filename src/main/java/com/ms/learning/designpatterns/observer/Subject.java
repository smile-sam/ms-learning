package com.ms.learning.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int temperature;
    private int humidity;

    List<Observer> observers = new ArrayList<>();

    public Subject(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void registryObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this.temperature,this.humidity);
        }
    }





    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
