package com.ms.learning.oop.ch1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/29 18:26
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {
        A a = new A();
        a.setId(1L);
        a.setName("张三");

        B b = new B();
        b.setAge(12);

        System.out.printf("姓名： %s \n", b.getName());


        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // Object bean = applicationContext.getBean("b");
        // System.out.println("bean" +bean);


        // == 解释器模式
        // SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        // Expression expression = spelExpressionParser.parseExpression("100 * 2(2+400) * 1+66");
        // int result = (int)expression.getValue();
        // System.out.println(result);

        Class clazz = Class.forName("com.ms.learning.oop.ch1.A");
        Object obj = clazz.newInstance();

        A aa = (A) clazz.newInstance();
        //获取 Person 类的所有方法信息
        Method[] method = clazz.getDeclaredMethods();
        for (Method m : method) {
            System.out.println(m.toString());
        }
        System.out.println("=====================================");
        //获取 Person 类的所有成员属性信息
        Field[] field = clazz.getDeclaredFields();

        for (Field f : field) {
            System.out.println(f.toString());
        }
        System.out.println("=====================================");
        //获取 Person 类的所有构造方法信息
        Constructor[] constructor = clazz.getDeclaredConstructors();
        for (Constructor c : constructor) {
            System.out.println(c.toString());
        }


        //获取 Person 类的 Class 对象

        Class clazz2 = Class.forName("com.ms.learning.oop.ch1.A");

        //使用.newInstane 方法创建对象

        A p = (A) clazz2.newInstance();

        //获取构造方法并创建对象

        Constructor c = clazz2.getDeclaredConstructor(Long.class, String.class, Integer.class);

        //创建对象并设置属性13/04/2018

        A p1 = (A) c.newInstance(1L, "张三--法外狂徒", 20);

        System.out.println(p1.getName());
    }
}
