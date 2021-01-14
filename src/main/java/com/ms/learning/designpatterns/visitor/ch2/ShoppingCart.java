package com.ms.learning.designpatterns.visitor.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 10:34
 * @version: v1.0
 */
public class ShoppingCart {
    public void add(Object object) {
        list.add(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public List getList() {
        return list;
    }

    private List list = new ArrayList();
}
