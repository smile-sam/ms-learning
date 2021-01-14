package com.ms.learning.designpatterns.state.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:45
 * @version: v1.0
 */
public class OpeningState extends LiftState {
    //执行打开电梯门方法
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    //打开后还可以关闭电梯门
    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //动作委托为CLOSING_STATE执行
        super.context.getLiftState().close();
    }

    @Override
    public void running() {
        //什么都不做
    }



    //门开着已经停止了
    @Override
    public void stop() {
        //什么都不做
    }
}
