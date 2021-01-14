package com.ms.learning.designpatterns.strategy.ch1;

import javax.sound.midi.Soundbank;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:11
 * @version: v1.0
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void operation1() {
        System.out.println("呱呱呱...");
    }

    @Override
    public void operation2() {
        System.out.println("起飞了...");
    }
}
