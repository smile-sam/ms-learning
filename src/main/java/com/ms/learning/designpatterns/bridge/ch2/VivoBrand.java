package com.ms.learning.designpatterns.bridge.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 13:58
 * @version: v1.0
 */
public class VivoBrand extends Brand {

    public VivoBrand(Phone phone) {
        super(phone);
    }

    public void open() {
        super.open();
        System.out.println(" Vivo手机开机 ");
    }

    public void close() {
        super.close();
        System.out.println(" Vivo手机关机 ");
    }

    public void call() {
        super.call();
        System.out.println(" Vivo手机打电话 ");
    }

}
