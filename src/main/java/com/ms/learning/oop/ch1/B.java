package com.ms.learning.oop.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/29 18:25
 * @version: v1.0
 */
public class B extends A {

    private String name;

    private Integer age;

    public B() {
    }

    public B(Integer age) {
        this.age = age;
    }

    public B(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        name = super.getName();
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
