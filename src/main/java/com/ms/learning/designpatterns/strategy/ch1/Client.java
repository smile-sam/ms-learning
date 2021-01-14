package com.ms.learning.designpatterns.strategy.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:08
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = DuckStrategyHolder.getStrategy(new BeijingDuck());
        Context context = new Context(strategy);
        strategy.operation1();
    }
}
