package com.ms.learning.designpatterns.decorator.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/4 9:39
 * @version: v1.0
 */
public class BenzCar implements Car{
    @Override
    public void run() {
        System.out.println("奔驰飞驰中...");
    }
}
