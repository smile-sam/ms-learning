package com.ms.learning.designpatterns.interpreter.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:56
 * @version: v1.0
 */
public class Context {
    private String value;

    public Context(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
