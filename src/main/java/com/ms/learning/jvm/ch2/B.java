package com.ms.learning.jvm.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/30 15:51
 * @version: v1.0
 */
public class B extends A {
    public String show(B obj) {
        return ("B and B");
    }

    public String show(A obj) {
        return ("B and A");
    }
}
