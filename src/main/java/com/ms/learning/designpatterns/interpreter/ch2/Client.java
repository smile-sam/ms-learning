package com.ms.learning.designpatterns.interpreter.ch2;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 　其中list为一个语法容器，容纳一个具体的表达式。通常Client是一个封装类，封装的结果就是传递进来一个规范语法文件，解析器分析后产生结果并返回，避免了调用者与语法分析器的耦合关系。
 * @author: sam
 * @date: 2021/1/11 14:43
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }
    }

    public static void jdk() {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("1000 * (2+400) * 2 + 66");
        int result = (Integer) expression.getValue();
        System.out.println(result);
    }
}
