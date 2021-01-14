package com.ms.learning.designpatterns.state.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:45
 * @version: v1.0
 */
public class RunningState extends LiftState {

    //运行时不能开门
    @Override
    public void open() {
        //什么都不做
    }

    //运行时门肯定是关的
    @Override
    public void close() {
        //什么都不做
    }

    // * 执行运行方法
    @Override
    public void running() {
        System.out.println("电梯运行中");
    }

    //运行后可以停止
    @Override
    public void stop() {
        //环境设置为停止状态
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }

}
