package com.ms.learning.designpatterns.visitor.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 10:28
 * @version: v1.0
 */
public interface Goods {
    double accept(GoodVisitor visitor);

}
