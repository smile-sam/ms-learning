package com.ms.learning.designpatterns.state.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 17:48
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        ContextState sss = new ContextState();
        sss.setCurrentState(new ConcreteStateA());
        sss.operation1();
        sss.operation2();
        sss.operation1();
        sss.operation2();

        sss.operation1();
        sss.operation2();
        sss.operation1();
        sss.operation2();
    }
}
