package com.ms.learning.designpatterns.state.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/11 18:44
 * @version: v1.0
 */
public abstract class LiftState {

    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void running();

    public abstract void stop();



}
