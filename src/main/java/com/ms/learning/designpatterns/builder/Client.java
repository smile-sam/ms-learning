package com.ms.learning.designpatterns.builder;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.util.Assert;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.Controller;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/5 15:43
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        BeanDefinitionBuilder beanDefinitionBuilder;

        HandlerAdapter handlerAdapter;

        DispatcherServlet dispatcherServlet;

        Controller controller;

        Controller controller1;
        save2(null, null);

    }


    public static String save2(Integer code, String name) {
        Assert.notNull(code, "code不能为空");
        Assert.notNull(name, "name不能为空");
        System.out.println("doSave");


        InputStream inputStream;

        FileInputStream fileInputStream;
        return null;
    }

}
