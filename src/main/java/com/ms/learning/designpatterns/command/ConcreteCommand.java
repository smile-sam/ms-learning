package com.ms.learning.designpatterns.command;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:05
 * @version: v1.0
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void Execute() {
        receiver.Action();
    }

    @Override
    public void open() {
        receiver.open();
    }

    @Override
    public void close() {
        receiver.close();
    }
}
