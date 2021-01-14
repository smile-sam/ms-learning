package com.ms.learning.designpatterns.strategy.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:32
 * @version: v1.0
 */
public class QuackBehavior implements Behavior {
    @Override
    public void behavior() {
        System.out.println("呱呱呱...");
    }
}
