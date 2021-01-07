package com.ms.learning.designpatterns.decorator;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/4 9:46
 * @version: v1.0
 */
public class AutoCarDecorator extends DecoratorCar {

    public AutoCarDecorator(Car decoratedCar){
        super(decoratedCar);
    }

    @Override
    public void run(){
        car.run();
        autoRun();
    }

    private void autoRun(){
        System.out.println("开启自动驾驶");
    }
}
