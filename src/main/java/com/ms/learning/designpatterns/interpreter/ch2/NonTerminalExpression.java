package com.ms.learning.designpatterns.interpreter.ch2;

/**
 * @description: 　　每个非终结符表达式都代表了一个文法规则，并且每个文法规则都只关心自己周边的文法规则的结果，因此这就产生了每个非终结符表达式调用自己周边的非终结符表达式，然后最终、最小的文法规则就是终结符表达式。
 * @author: sam
 * @date: 2021/1/11 15:09
 * @version: v1.0
 */
public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
