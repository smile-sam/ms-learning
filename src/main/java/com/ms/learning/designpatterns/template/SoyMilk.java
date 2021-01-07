package com.ms.learning.designpatterns.template;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 14:42
 * @version: v1.0
 */
public abstract class SoyMilk {

    public void operation() {
        // 选材
        operation1();
        // 配料
        operation2();
        // 打豆浆
        operation3();
    }


    public abstract void operation1() ;
    public abstract void operation2() ;
    public abstract void operation3() ;
}
