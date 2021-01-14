package com.ms.learning.designpatterns.state.ch1;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 17:49
 * @version: v1.0
 */
public class ContextState {

    private State currentState;

    public ContextState() {
    }

    public final static State STATEA = new ConcreteStateA();
    public final static State STATEB = new ConcreteStateB();

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    //
    // public State getCurrentState() {
    //     return currentState;
    // }
    //
    //
    //
    // public void setCurrentState(State currentState) {
    //     this.currentState = currentState;
    //     // 切换状态
    //     this.currentState.setContext(this);
    // }

    public void operation1() {
        this.currentState.operation1();
    }

    public void operation2() {
        this.currentState.operation2();
    }
}
