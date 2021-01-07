package com.ms.learning.designpatterns.decorator;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/4 9:39
 * @version: v1.0
 */
public class AudiCar implements Car {
    @Override
    public void run() {
        System.out.println("奥迪车飞驰中...");
    }
}
