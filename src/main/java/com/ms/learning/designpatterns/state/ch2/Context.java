package com.ms.learning.designpatterns.state.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:43
 * @version: v1.0
 */
public class Context {

    // 定义出电梯运行的所有状态
    public final static LiftState OPENING_STATE = new OpeningState();

    public final static LiftState CLOSING_STATE = new ClosingState();
    public final static LiftState RUNNING_STATE = new RunningState();
    public final static LiftState STOPPING_STATE = new StoppingState();

    //定义一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void running() {
        this.liftState.running();
    }

    public void stop() {
        this.liftState.stop();
    }


}
