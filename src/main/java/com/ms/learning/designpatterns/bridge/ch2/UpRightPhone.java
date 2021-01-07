package com.ms.learning.designpatterns.bridge.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:00
 * @version: v1.0
 */
public class UpRightPhone implements Phone {

    @Override
    public void open() {
        System.out.println(" 直立样式手机 ");
    }

    @Override
    public void close() {
        System.out.println(" 直立样式手机 ");
    }

    @Override
    public void call() {
        System.out.println(" 直立样式手机 ");
    }
}
