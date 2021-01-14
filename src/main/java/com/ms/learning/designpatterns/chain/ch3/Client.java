package com.ms.learning.designpatterns.chain.ch3;

import org.springframework.aop.framework.AopProxy;
import org.springframework.aop.framework.AopProxyFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerExecutionChain;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 14:23
 * @version: v1.0
 */
public class Client {


    public static void main(String[] args) {
        AopProxyFactory aopProxyFactory;
        AopProxy aopProxy;

        DispatcherServlet dispatcherServlet;

        BeanFactory beanFactory
                ;

        ApplicationContext applicationContext;

        JdbcTemplate jdbcTemplate;
        StatementCallback statementCallback;


    }
}
