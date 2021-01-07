package com.ms.learning.jvm.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/30 15:04
 * @version: v1.0
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //测试一的输出
        System.out.println(Children1.children1);
        System.out.println("-------------------------------");
        //测试二的输出
        System.out.println(Children2.parent2);
        System.out.println("--------------------------------");
        //测试三的输出
        System.out.println(Children3.parent3);
    }
    //你认为输出什么呢
    class A {

    }
}

//题目一
class Parent1 {
    public static String parent1 = "hello parent1";

    static {
        System.out.println("Parent1 静态代码块");
    }
}

class Children1 extends Parent1 {
    public static String children1 = "hello children1";

    static {
        System.out.println("Children1 静态代码块");
    }
}

//----------------------------------------------------------------
//题目二
class GrandParent2 {
    static {
        System.out.println("GrandParent2静态代码块");
    }
}

class Parent2 extends GrandParent2 {
    public static String parent2 = "hello parent2";

    static {
        System.out.println("Parent2 静态代码块");
    }
}

class Children2 extends Parent2 {
    public static String children2 = "hello children2";

    static {
        System.out.println("Children2 静态代码块");
    }
}

//----------------------------------------------------------------
//题目三
class GrandParent3 {
    static {
        System.out.println("GrandParent3静态代码块");
    }
}

class Parent3 extends GrandParent3 {
    public final static String parent3 = "hello parent3";

    static {
        System.out.println("Parent3 静态代码块");
    }
}

class Children3 extends Parent3 {
    public static String children3 = "hello children3";

    static {
        System.out.println("Children3 静态代码块");
    }
}