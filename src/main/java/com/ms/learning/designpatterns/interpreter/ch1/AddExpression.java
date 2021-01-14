package com.ms.learning.designpatterns.interpreter.ch1;

import java.util.HashMap;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 17:17
 * @version: v1.0
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
