package com.ms.learning.designpatterns.visitor;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 9:38
 * @version: v1.0
 */
public abstract  class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}
