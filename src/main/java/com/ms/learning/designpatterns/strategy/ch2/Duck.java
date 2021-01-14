package com.ms.learning.designpatterns.strategy.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:30
 * @version: v1.0
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;


    public Duck() {

    }

    public abstract void display(); // 显示鸭子信息

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void quack() {
        System.out.println("呱呱呱...");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.behavior();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
