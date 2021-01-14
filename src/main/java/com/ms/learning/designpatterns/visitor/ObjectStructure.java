package com.ms.learning.designpatterns.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 9:39
 * @version: v1.0
 */
public class ObjectStructure {

    private List<Element> elements = new LinkedList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

}