package com.ms.learning.designpatterns.proxy.jdk;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 10:32
 * @version: v1.0
 */
public class HiImpl implements Hi{

    @Override
    public void sayHi() {
        System.out.println("hi");
    }
}
