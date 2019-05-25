package com.ai.gof.creational.singleton;

public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public EnumInstance getInstance(){
        return INSTANCE;
    }
}
