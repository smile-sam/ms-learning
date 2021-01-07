package com.ms.learning.oop.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/29 18:25
 * @version: v1.0
 */
public class A {

    private static int aa;

    private final String bb = "bb";

    private final static String cc = "cc";

    private Long id;
    private String name;

    private Integer a;

    public A() {
        this.name = "张三";
    }

    public A(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public A(Long id, String name, Integer a) {
        this.id = id;
        this.name = name;
        this.a = a;
    }

    private void a() {
        a++;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
