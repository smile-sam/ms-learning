package com.ms.learning.designpatterns.decorator;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/4 9:38
 * @version: v1.0
 */
public class BmwCar implements Car{
    @Override
    public void run() {
        System.out.println("宝马车飞驰中...");
    }
}
