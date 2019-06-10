package com.ai.thread.activeobject;

public class ActiveObjectFactory {

    private ActiveObjectFactory(){}

    public static ActiveObject createActiveObjet(){
        Servant servant = new Servant();
        ActivationQueue queue = new ActivationQueue();
        SchedulerThread schedulerThread = new SchedulerThread(queue);
        ActiveObjectProxy proxy = new ActiveObjectProxy(schedulerThread,servant);
        schedulerThread.start();
        return proxy;
    }
}
