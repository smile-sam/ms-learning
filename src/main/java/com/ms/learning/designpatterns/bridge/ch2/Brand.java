package com.ms.learning.designpatterns.bridge.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 13:57
 * @version: v1.0
 */
public abstract class Brand {
    Phone phone;

    //构造器
    public Brand(Phone phone) {
        super();
        this.phone = phone;
    }

    protected void open() {
        this.phone.open();
    }

    protected void close() {
        phone.close();
    }

    protected void call() {
        phone.call();
    }
}
