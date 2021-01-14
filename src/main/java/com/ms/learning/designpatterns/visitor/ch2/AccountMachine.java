package com.ms.learning.designpatterns.visitor.ch2;

import java.util.List;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 10:33
 * @version: v1.0
 */
public class AccountMachine {
    private double amt;
    private double amt2;
    public void account(List list) {
        GoodVisitor visitor = new GoodVisitorImpl();
        for (int i = 0; i < list.size(); i++) {
            amt += ((Goods)list.get(i)).accept(visitor);
        }
    }
    public void account2(List list) {
        GoodVisitor visitor2 = new GoodVisitor2Impl();
        for (int i = 0; i < list.size(); i++) {
            amt2 += ((Goods)list.get(i)).accept(visitor2);
        }
    }
    public double getAmt() {
        return amt;
    }
    public double getAmt2() {
        return amt2;
    }
}
