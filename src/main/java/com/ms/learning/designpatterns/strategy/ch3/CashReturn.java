package com.ms.learning.designpatterns.strategy.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 11:05
 * @version: v1.0
 */
public class CashReturn  extends CashSuper {

    private double moneyCondition = 0.0;    //返利条件
    private double moneyReturn = 0.0d;    //返利值

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return result;
    }

}