package com.ms.learning.designpatterns.interpreter.ch3;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:57
 * @version: v1.0
 */
public class AiInterpreter implements Interpreter{
    @Override
    public void parse(Context context) {
        if(context.getValue().indexOf("爱") != -1) {
            System.out.println("Love");
        }
    }
}
