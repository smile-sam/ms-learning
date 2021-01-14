package com.ms.learning.designpatterns.interpreter.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:58
 * @version: v1.0
 */
public class NiInterpreter implements Interpreter{
    @Override
    public void parse(Context context) {
        if(context.getValue().indexOf("你") != -1) {
            System.out.println("You");
        }
    }
}
