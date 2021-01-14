package com.ms.learning.designpatterns.visitor;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 9:39
 * @version: v1.0
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
