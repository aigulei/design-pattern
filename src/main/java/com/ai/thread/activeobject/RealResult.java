package com.ai.thread.activeobject;

public class RealResult implements Result {

    private final Object resultValue;

    public RealResult(Object resultValue){
        this.resultValue = resultValue;
    }

    @Override
    public Object getResultValue() {
        return this.resultValue;
    }
}
