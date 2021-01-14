package com.ms.learning.designpatterns.strategy.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:25
 * @version: v1.0
 */
public class DuckStrategyHolder {

    public static  Strategy getStrategy(Duck duck){
        if(duck instanceof BeijingDuck) {
            return new ConcreteStrategyA();
        } else {
            return new ConcreteStrategyB();
        }

    }


}
