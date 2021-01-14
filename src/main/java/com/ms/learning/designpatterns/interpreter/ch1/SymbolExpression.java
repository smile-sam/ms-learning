package com.ms.learning.designpatterns.interpreter.ch1;

import java.util.HashMap;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 15:16
 * @version: v1.0
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // TODO Auto-generated method stub
        return 0;
    }
}
