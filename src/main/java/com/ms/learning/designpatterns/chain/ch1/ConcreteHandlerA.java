package com.ms.learning.designpatterns.chain.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 13:48
 * @version: v1.0
 */
public class ConcreteHandlerA extends Handler {

    public ConcreteHandlerA(Handler successor) {
        super(successor);
    }

    @Override
    public void processRequest() {
        System.out.println("request A");
        if(this.successor !=null) {
            this.successor.processRequest();
        }
    }
}
