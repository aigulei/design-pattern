package com.ai.gof.creational.prototype.abstractprototye;

public abstract class A implements  Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
