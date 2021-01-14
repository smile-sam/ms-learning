package com.ms.learning.designpatterns.strategy.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 11:04
 * @version: v1.0
 */
public class CashRebate  extends CashSuper {

    private double moneyRebate = 1;    //折扣

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
