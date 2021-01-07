package com.ms.learning.designpatterns.template;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 14:45
 * @version: v1.0
 */
public class BlackSoyMilk extends SoyMilk {
    @Override
    public void operation1() {
        System.out.println("选材： 黑豆");
    }

    @Override
    public void operation2() {
        System.out.println("配料: 蜂蜜");
    }

    @Override
    public void operation3() {
        System.out.println("使用九阳豆浆机");
    }
}
