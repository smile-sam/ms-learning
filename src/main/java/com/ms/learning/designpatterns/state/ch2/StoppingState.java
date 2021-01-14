package com.ms.learning.designpatterns.state.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:45
 * @version: v1.0
 */
public class StoppingState extends LiftState {

    //停下了要开门
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }

    //门本来就是关着的
    @Override
    public void close() {
        //什么都不做
    }

    //停止后可以再运行
    @Override
    public void running() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().running();
    }

    //执行停止方法
    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }


}
