package com.ms.learning.designpatterns.visitor;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 9:43
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
        ConcreteVisitor3 visitor3 = new ConcreteVisitor3();
        objectStructure.accept(visitor1);
        objectStructure.accept(visitor2);
        objectStructure.accept(visitor3);
    }

}