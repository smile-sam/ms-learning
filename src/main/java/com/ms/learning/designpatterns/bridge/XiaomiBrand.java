package com.ms.learning.designpatterns.bridge;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 13:59
 * @version: v1.0
 */
public class XiaomiBrand implements Brand {
    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println(" 小米手机开机 ");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println(" 小米手机关机 ");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println(" 小米手机打电话 ");
    }
}
