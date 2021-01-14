package com.ms.learning.designpatterns.visitor.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 10:32
 * @version: v1.0
 */
public class GoodVisitor2Impl implements GoodVisitor {
    @Override
    public double visit(Wine wine) {
        return wine.accountByBottle() * 0.8;
    }

    @Override
    public double visit(Pig pig) {
        return pig.accountByUnit() * 0.5;
    }

    @Override
    public double visit(Television television) {
        return television.accountByPiece() * 0.9;
    }
}
