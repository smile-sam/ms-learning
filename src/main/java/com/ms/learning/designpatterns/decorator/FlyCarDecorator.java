package com.ms.learning.designpatterns.decorator;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/4 9:46
 * @version: v1.0
 */
public class FlyCarDecorator extends DecoratorCar {

    public FlyCarDecorator(Car decoratedCar){
        super(decoratedCar);
    }

    @Override
    public void run(){
        car.run();
        fly();
    }

    private void fly(){
        System.out.println("开启飞行汽车模式");
    }
}

