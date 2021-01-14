package com.ms.learning.designpatterns.chain.ch1;

public abstract class Handler {

    Handler successor;

    public Handler(Handler successor) {


        this.successor = successor;
    }

    public abstract void processRequest();
}
