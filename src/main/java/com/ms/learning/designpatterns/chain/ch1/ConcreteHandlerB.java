package com.ms.learning.designpatterns.chain.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 13:48
 * @version: v1.0
 */
public class ConcreteHandlerB extends Handler {

    public ConcreteHandlerB(Handler successor) {
        super(successor);
    }

    @Override
    public void processRequest() {
        System.out.println("request B");
        if(this.successor !=null) {
            this.successor.processRequest();
        }
    }
}
