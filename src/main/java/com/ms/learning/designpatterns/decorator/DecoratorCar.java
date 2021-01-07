package com.ms.learning.designpatterns.decorator;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/4 9:40
 * @version: v1.0
 */
public class DecoratorCar implements Car {
    Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.run();
    }


}
