package com.ms.learning.designpatterns.visitor.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 10:29
 * @version: v1.0
 */
public interface GoodVisitor {
    double visit(Wine wine);
    double visit(Pig pig);
    double visit(Television television);
}
