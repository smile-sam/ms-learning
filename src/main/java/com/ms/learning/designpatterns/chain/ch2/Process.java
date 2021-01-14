package com.ms.learning.designpatterns.chain.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 14:11
 * @version: v1.0
 */
public interface Process {

    /**
     * 执行处理
     *
     * @param msg
     */
    void handler(String msg);
}
