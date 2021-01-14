package com.ms.learning.designpatterns.strategy.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:11
 * @version: v1.0
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void operation1() {
        System.out.println("哒哒哒...");
    }

    @Override
    public void operation2() {
        System.out.println("飞不了...");
    }
}
