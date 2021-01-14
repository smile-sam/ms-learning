package com.ms.learning.designpatterns.interpreter.ch2;

/**
 * 终结符表达式
 * @description: 终结符表达式 通常，终结符表达式比较简单，主要处理场景元素和数据的转换
 * @author: sam
 * @date: 2021/1/11 15:08
 * @version: v1.0
 */
public class TerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
