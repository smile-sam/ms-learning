package com.ms.learning.designpatterns.strategy.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 10:28
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();//

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        //动态改变某个对象的行为, 北京鸭 不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("北京鸭的实际飞翔能力");
        pekingDuck.fly();
    }
}
