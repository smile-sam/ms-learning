package com.ms.learning.designpatterns.state.ch1;

public abstract class State {

    ContextState context;

    public abstract void operation1();
    public abstract void operation2();

    void setContext(ContextState context){
        this.context = context;
    }
}
