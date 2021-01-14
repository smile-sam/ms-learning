package com.ms.learning.designpatterns.state.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:51
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        // 定义初始状态为关门（共四种初始值）
        context.setLiftState(new RunningState());
        context.open();
        context.close();
        context.running();
        context.stop();
    }

}
