package com.ms.learning.designpatterns.chain.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 14:14
 * @version: v1.0
 */
public class CopyrightProcess implements Process {
    @Override
    public void handler(String msg) {
        System.out.println(msg + "\t 版权处理");
    }
}
