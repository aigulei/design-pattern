package com.ai.thread.gate;

/**
 * 一个门始终只有一个人通过
 */
public class Gate {
    private int counter = 0;

    private String name = "NoBody";

    private String address = "NoWhere";

    public synchronized void pass(String name,String address){
        this.counter++;
        this.name = name;
        this.address = address;
        verify();
    }
    private void verify(){
        if(this.name.charAt(0) !=this.address.charAt(0)){
            System.out.println(".....broken...."+toString());
        }
    }

    @Override
    public synchronized String toString() {
        return "No."+counter+":"+name+","+address;
    }
}
