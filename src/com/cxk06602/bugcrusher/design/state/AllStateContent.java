package com.cxk06602.bugcrusher.design.state;

public class AllStateContent {
    private State state = null;

    public AllStateContent(State state) {
        this.state = state;
    }
    public void action(){
        state.handle(this);
    }

    //---------getter和setter方法

    public State getState(){
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}