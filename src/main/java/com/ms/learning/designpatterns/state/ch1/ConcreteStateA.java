package com.ms.learning.designpatterns.state.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 17:50
 * @version: v1.0
 */
public class ConcreteStateA extends State{

    @Override
    public void operation1() {
        System.out.println("ConcreteStateA operation1...");
    }

    @Override
    public void operation2() {
        System.out.println("ConcreteStateA operation2...");
        super.context.setCurrentState(ContextState.STATEB);
    }

}
