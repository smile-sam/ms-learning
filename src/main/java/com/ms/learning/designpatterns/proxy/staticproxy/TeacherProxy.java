package com.ms.learning.designpatterns.proxy.staticproxy;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 10:21
 * @version: v1.0
 */
public class TeacherProxy implements Teacher{
    Teacher teacher;

    public TeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("授课开始");
        teacher.teach();
        System.out.println("授课结束");
    }
}
