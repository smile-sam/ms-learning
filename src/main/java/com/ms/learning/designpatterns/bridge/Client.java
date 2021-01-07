package com.ms.learning.designpatterns.bridge;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 13:57
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {

        //获取折叠式手机 (样式 + 品牌 )

        Phone phone1 = new FoldedPhone(new XiaomiBrand());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("=======================");

        Phone phone2 = new FoldedPhone(new VivoBrand());

        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("==============");

        UpRightPhone phone3 = new UpRightPhone(new XiaomiBrand());

        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("==============");

        UpRightPhone phone4 = new UpRightPhone(new VivoBrand());

        phone4.open();
        phone4.call();
        phone4.close();
    }
}
