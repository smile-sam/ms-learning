package com.ms.learning.designpatterns.strategy.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:48
 * @version: v1.0
 */
public class ToyDuck extends Duck{

    public ToyDuck() {

        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭...");
    }


    //需要重写父类的所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }
}
