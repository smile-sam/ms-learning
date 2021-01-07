package com.ms.learning.designpatterns.command;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:03
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.SetCommand(command);
        invoker.ExecuteCommand();
        invoker.close();
    }
}
