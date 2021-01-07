package com.ms.learning.designpatterns.composite.ch2;

import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:47
 * @version: v1.0
 */
public class Composite implements Component{
    private ArrayList<Component> children = new ArrayList<>();


    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for(Object obj: children) {
            ((Component)obj).operation();
        }
    }
}
