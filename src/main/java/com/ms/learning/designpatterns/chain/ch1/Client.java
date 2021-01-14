package com.ms.learning.designpatterns.chain.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 13:47
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {

        Request request = new Request();

        Handler handler = new ConcreteHandlerA(new ConcreteHandlerB(null));
         handler.processRequest();



    }
}
