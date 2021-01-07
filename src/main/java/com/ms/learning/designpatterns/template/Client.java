package com.ms.learning.designpatterns.template;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 14:42
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        SoyMilk soyMilk = new BlackSoyMilk();
        soyMilk.operation();

        // RedisTemplate redisTemplate;
    }
}
