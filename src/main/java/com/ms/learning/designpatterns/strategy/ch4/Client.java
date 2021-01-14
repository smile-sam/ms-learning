package com.ms.learning.designpatterns.strategy.ch4;

import java.util.Arrays;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 11:24
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        args = new String[]{"1", "+", "2"};
        // 输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1]; // 符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为： " + Arrays.toString(args));
        System.out.println("运行结果为： " + a + symbol + b + "=" + Calculator.ADD.exec(a, b));






    }
}
