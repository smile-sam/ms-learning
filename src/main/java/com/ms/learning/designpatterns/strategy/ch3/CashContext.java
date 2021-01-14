package com.ms.learning.designpatterns.strategy.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 11:01
 * @version: v1.0
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
