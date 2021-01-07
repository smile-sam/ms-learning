package com.ms.learning.designpatterns.proxy.jdk;

import io.swagger.models.auth.In;
import sun.security.jca.GetInstance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 10:27
 * @version: v1.0
 */
public class UserProxy   {

    Object target;

    public UserProxy(Object target) {
        this.target = target;
    }



    public Object getInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(target,args);
            }
        });
    }
}
