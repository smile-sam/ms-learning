package com.ms.learning.designpatterns.state.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:45
 * @version: v1.0
 */
public class ClosingState extends LiftState {

    //电梯门关了可以再开
    @Override
    public void open() {
        //置为敞门状态
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }

    // * 执行电梯门关闭方法
    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    //电梯门关了就运行
    @Override
    public void running() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().running();
    }

    //电梯门关了但没有按楼层
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
