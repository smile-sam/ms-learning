package com.ms.learning.designpatterns.composite.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:45
 * @version: v1.0
 */
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i );
    public void operation();
}
