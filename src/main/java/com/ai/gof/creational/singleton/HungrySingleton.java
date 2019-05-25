package com.ai.gof.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


    private HungrySingleton(){
        if(hungrySingleton!=null){
            throw  new RuntimeException("私有方法不允许反射实例化");
        }
    }

    //ObjectInputStream.readObject()
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
