package com.ms.learning.designpatterns.interpreter.ch3;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:59
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context("我 爱 你");
        List list = new ArrayList();
        list.add(new WoInterpreter());
        list.add(new SymbolInterpreter());
        list.add(new AiInterpreter());
        list.add(new SymbolInterpreter());
        list.add(new NiInterpreter());
        for (int i = 0; i < list.size(); i++) {
            Interpreter interpreter = (Interpreter)list.get(i);
            interpreter.parse(context);
        }

    }
}
