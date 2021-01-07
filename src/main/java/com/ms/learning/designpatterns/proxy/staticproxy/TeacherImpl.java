package com.ms.learning.designpatterns.proxy.staticproxy;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 10:20
 * @version: v1.0
 */
public class TeacherImpl implements Teacher {
    @Override
    public void teach() {
        System.out.println("授课");
    }
}
