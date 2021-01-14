package com.ms.learning.designpatterns.interpreter.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:59
 * @version: v1.0
 */
public class SymbolInterpreter implements Interpreter {
    @Override
    public void parse(Context context) {
        if(context.getValue().indexOf(" ") != -1) {
            System.out.println(" ");
        }
    }
}
