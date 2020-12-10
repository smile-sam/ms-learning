package com.ms.learning.designpatterns.proxy.cglib;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 10:52
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        // 动态产生的CGLibSuper的子类实例
        CGLibSuper proxy = cgLibProxy.getProxy(CGLibSuper.class);
        proxy.doing();
    }
}
