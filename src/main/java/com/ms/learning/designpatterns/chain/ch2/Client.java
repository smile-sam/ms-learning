package com.ms.learning.designpatterns.chain.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 13:52
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        String msg = "内容内容内容==" ;
        MsgProcessChain chain = new MsgProcessChain()
                .addChain(new SensitiveWordProcess())
                .addChain(new TypoProcess())
                .addChain(new CopyrightProcess()) ;
        chain.process(msg) ;




    }
}
