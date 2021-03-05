package com.ms.learning.test;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Stream;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 9:48
 * @version: v1.0
 */
public class Test {

    public static void main(String[] args) {
        test5();
// test1();
//         test2();
//         test3();
//         test4();


        // Stream.of(100, 200, 300, 400, 500)
        //         .mapToLong(e -> e * 10)
        //         .filter(e -> e > 2000)
        //         .forEach(System.out::println);
    }


    public static void test1() {
        System.out.println("========================test1=======================");
        //#1
        String str1 = "what";
        //#2
        String str2 = str1 + " a nice day";
        //#3
        System.out.println("what a nice day".equals(str2));
        //#4
        System.out.println("what a nice day" == str2);
    }


    public static void  test2() {
        System.out.println("========================test2=======================");
        String str1 = "what";
        String str2 = str1 + " a nice day";
        System.out.println("what a nice day".equals(str2));
        System.out.println("what a nice day" == str2);
    }

    public static void  test3() {
        System.out.println("========================test3=======================");
        String str1 = "what a nice day";
        String str2 = new String("what a nice day");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }

    public static void  test4() {
        System.out.println("========================test4=======================");
        String str1 = "what";
        String str2 = str1.concat(" a nice day");
        System.out.println("what a nice day".equals(str2));
        System.out.println("what a nice day" == str2);
        System.out.println("what a nice day"==str2.intern());
    }


    public static void test5() {
        ThreadPoolExecutor.CallerRunsPolicy cv;

        String a = new String("haha");
        System.out.println(a.intern() == a);//false
        // String str1 = new StringBuilder("计算机").append("软件").toString();
        // System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }

}
