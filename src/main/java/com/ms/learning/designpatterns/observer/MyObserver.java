package com.ms.learning.designpatterns.observer;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/9 9:30
 * @version: v1.0
 */
public class MyObserver implements Observer{
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("温度" +temperature+"\t 湿度"+ humidity);
    }
}
