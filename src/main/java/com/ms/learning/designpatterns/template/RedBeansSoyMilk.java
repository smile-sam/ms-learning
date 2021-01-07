package com.ms.learning.designpatterns.template;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 14:46
 * @version: v1.0
 */
public class RedBeansSoyMilk extends SoyMilk {
    @Override
    public void operation1() {
        System.out.println("红豆");
    }

    @Override
    public void operation2() {
        System.out.println("白糖");
    }

    @Override
    public void operation3() {
        System.out.println("使用美的豆浆机");
    }
}
