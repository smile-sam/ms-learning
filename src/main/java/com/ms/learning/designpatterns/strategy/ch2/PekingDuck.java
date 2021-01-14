package com.ms.learning.designpatterns.strategy.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:47
 * @version: v1.0
 */
public class PekingDuck extends Duck{

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
