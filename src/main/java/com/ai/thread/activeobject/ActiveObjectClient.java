package com.ai.thread.activeobject;

public class ActiveObjectClient {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObjet();
        new MakeClientThread(activeObject,"Alice").start();
        new MakeClientThread(activeObject,"Bobby").start();

        new DisplayClientThread("Chris",activeObject).start();
    }
}
