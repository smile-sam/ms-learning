package com.ms.learning.designpatterns.command.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:20
 * @version: v1.0
 */
public class CloseCommand extends Command{
    public CloseCommand(Receiver receiver) {
        super(receiver);
    }
    @Override
    public void Execute() {
        receiver.close();
    }
}
