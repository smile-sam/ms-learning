package com.ms.learning.designpatterns.strategy.jdk;

import java.awt.image.ComponentColorModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 11:28
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Integer [] data = {999999,59999999,69999,2,1,59999999,3};

        // 实现升序排序，返回 -1放左边 1 放右边，0 保持不变

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if(o1 > (o2) ) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Arrays.sort(data, comparator);

        System.out.println(Arrays.toString(data));


    }
}
