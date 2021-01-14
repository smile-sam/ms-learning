package com.ms.learning.designpatterns.strategy.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 11:04
 * @version: v1.0
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
