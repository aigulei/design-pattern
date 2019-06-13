package com.ai.gof.behavioral.observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;

    public void setState(int state) {
        if(this.state==state){
            return;
        }
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyObservers(){
        observers.forEach(observer -> {
            observer.change();
        });
    }
}
