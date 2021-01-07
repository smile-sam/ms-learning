package com.ms.learning.designpatterns.composite.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:46
 * @version: v1.0
 */
public class Leaf implements Component {
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+":被访问！");
    }
}
