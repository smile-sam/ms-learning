package com.ms.learning.designpatterns.bridge.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:07
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Brand brand = new XiaomiBrand(new FoldedPhone());
        brand.call();
    }
}
