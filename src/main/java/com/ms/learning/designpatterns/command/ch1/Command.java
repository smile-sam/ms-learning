package com.ms.learning.designpatterns.command.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:04
 * @version: v1.0
 */
public abstract class Command {
    protected Receiver receiver;

    protected Command(Receiver receiver) {
        if (receiver == null) {
            throw new NullPointerException();
        }
        this.receiver = receiver;
    }


    public abstract void Execute();
}
