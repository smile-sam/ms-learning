package com.ms.learning.designpatterns.interpreter.ch1;

import java.util.HashMap;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 15:15
 * @version: v1.0
 */
public class VarExpression  extends Expression{

    private String key;

    public VarExpression(String key) {
        this.key = key ;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
