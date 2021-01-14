package com.ms.learning.designpatterns.visitor;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 9:39
 * @version: v1.0
 */
public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    //其它方法
    public void operationB() {

    }

}