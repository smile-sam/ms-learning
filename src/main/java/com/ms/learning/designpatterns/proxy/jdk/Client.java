package com.ms.learning.designpatterns.proxy.jdk;


import java.lang.reflect.Proxy;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 10:33
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Hi hi = (Hi)Proxy.newProxyInstance(RealSubject.class.getClassLoader(), new Class[]{Hi.class}, new RealSubject((new HiImpl())));
        hi.sayHi();

    }
}
