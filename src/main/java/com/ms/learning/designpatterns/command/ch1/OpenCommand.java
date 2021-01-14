package com.ms.learning.designpatterns.command.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:20
 * @version: v1.0
 */
public class OpenCommand extends Command{
    public OpenCommand(Receiver receiver) {
        super(receiver);
    }
    @Override
    public void Execute() {
        receiver.open();
    }
}
