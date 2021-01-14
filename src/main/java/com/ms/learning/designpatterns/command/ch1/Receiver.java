package com.ms.learning.designpatterns.command.ch1;

import java.io.Console;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 15:04
 * @version: v1.0
 */
public class Receiver {
    public void Action() {
        System.out.println("Action in receiver");
    }

    public void open() {

        System.out.println("open");
    }

    public void close() {
        System.out.println("close");
    }
}
