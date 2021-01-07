package com.ms.learning.designpatterns.bridge;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 13:57
 * @version: v1.0
 */
public abstract class Phone {
    Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
