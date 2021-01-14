package com.ms.learning.designpatterns.command.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:06
 * @version: v1.0
 */
public class Invoker {
    private Command _command;

    private Command openCommand;

    private Command closeCommand;

    public void SetCommand(Command command) {
        _command = command;
    }
    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }
    public void setCloseCommand(Command closeCommand) {
        this.closeCommand = closeCommand;
    }
    public void ExecuteCommand() {
        _command.Execute();
    }

    public void open() {
        openCommand.Execute();
    }

    public void close() {
        closeCommand.Execute();
    }
}
