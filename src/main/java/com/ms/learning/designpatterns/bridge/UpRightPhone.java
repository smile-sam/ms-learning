package com.ms.learning.designpatterns.bridge;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:00
 * @version: v1.0
 */
public class UpRightPhone extends Phone{
    //构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 直立样式手机 ");
    }

    public void close() {
        super.close();
        System.out.println(" 直立样式手机 ");
    }

    public void call() {
        super.call();
        System.out.println(" 直立样式手机 ");
    }
}
