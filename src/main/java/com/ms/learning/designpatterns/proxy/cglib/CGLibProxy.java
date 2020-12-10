package com.ms.learning.designpatterns.proxy.cglib;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 10:51
 * @version: v1.0
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 通过已有的类产生代理类时
 * 在当前辅助类需要实现MethodInterceptor接口
 */
public class CGLibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public <T> T getProxy(Class<T> clazz){
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码动态的创建子类实例
        return (T)enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLibProxy doing start");
        //拦截到父类响应的方法
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("CGLibProxy doing end");
        return o1;
    }
}
