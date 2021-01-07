package com.ms.learning.designpatterns.proxy.staticproxy;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 10:19
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Teacher teacher = new TeacherImpl();

        TeacherProxy teacherProxy = new TeacherProxy(teacher);

        teacher.teach();
        System.out.println("===================");
        teacherProxy.teach();
    }


}
