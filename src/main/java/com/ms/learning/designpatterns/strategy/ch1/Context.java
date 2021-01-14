package com.ms.learning.designpatterns.strategy.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:10
 * @version: v1.0
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operation1(){
        this.strategy.operation1();
    }

    public void operation2(){
        this.strategy.operation2();
    }
}
