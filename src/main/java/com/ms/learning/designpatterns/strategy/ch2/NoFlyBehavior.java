package com.ms.learning.designpatterns.strategy.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:49
 * @version: v1.0
 */
public class NoFlyBehavior extends FlyBehavior {

    @Override
    public void behavior() {
        System.out.println("不会飞...");
    }
}
