package com.ms.learning.designpatterns.bridge.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 13:59
 * @version: v1.0
 */
public class XiaomiBrand extends Brand {

    public XiaomiBrand(Phone phone) {
        super(phone);
    }

    public void open() {
        super.open();
        System.out.println(" 小米手机开机 ");
    }

    public void close() {
        super.close();
        System.out.println(" 小米手机关机 ");
    }

    public void call() {
        super.call();
        System.out.println(" 小米手机打电话 ");
    }
}
