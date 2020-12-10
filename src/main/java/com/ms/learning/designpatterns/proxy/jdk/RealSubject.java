package com.ms.learning.designpatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 10:33
 * @version: v1.0
 */
public class RealSubject implements InvocationHandler {
   private Object object;

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
    }
    public RealSubject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("doing RealSubject.invoke start");
        method.invoke(object, args);
        System.out.println("doing RealSubject.invoke end");
        return null;
    }
}
