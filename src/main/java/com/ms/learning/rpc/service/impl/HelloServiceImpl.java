package com.ms.learning.rpc.service.impl;

import com.ms.learning.rpc.service.HelloService;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/8 13:55
 * @version: v1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("Hi," + name);
        return "Hi," + name;
    }

    @Override
    public String getName() {
        return "张三";
    }
}
