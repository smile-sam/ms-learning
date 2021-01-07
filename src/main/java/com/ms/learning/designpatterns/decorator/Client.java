package com.ms.learning.designpatterns.decorator;

import java.io.FilterInputStream;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/4 9:47
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Car benzCar = new BenzCar();
        Car bmwCar = new BmwCar();
        Car audiCar = new AudiCar();

        // 创建自动驾驶的奔驰汽车
        DecoratorCar autoBenzCar = new AutoCarDecorator(benzCar);

        // 创建飞行的、自动驾驶的宝马汽车
        DecoratorCar flyAutoBmwCar = new FlyCarDecorator(new AutoCarDecorator(bmwCar));

        benzCar.run();
        bmwCar.run();
        audiCar.run();
        System.out.println("=======");
        autoBenzCar.run();

        System.out.println("=======");
        flyAutoBmwCar.run();


    }
}
