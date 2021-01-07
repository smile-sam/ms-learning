package com.ms.learning.designpatterns.command;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:06
 * @version: v1.0
 */
public class Invoker {
    private Command _command;

    public void SetCommand(Command command) {
        _command = command;
    }

    public void ExecuteCommand() {
        _command.Execute();
    }

    public void open() {
        _command.open();
    }

    public void close() {
        _command.close();
    }
}
