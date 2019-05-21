package com.ai.thread.immutable;


public class ImmutablePerformance {
    public static void main(String[] args) {
        long startTimestamp = System.currentTimeMillis();
        /*SyncObj obj = new SyncObj();
        obj.setName("alex");*/
        ImmutableObj obj = new ImmutableObj("alex");
        for(long l=0L;l<1000000;l++){
            System.out.println(obj.toString());
        }
        long endTimestamp = System.currentTimeMillis();
        System.out.println("Elapsed time "+ (endTimestamp - startTimestamp));

    }
}
final class ImmutableObj{
    private final String name;
    ImmutableObj(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "name='" + name + '\'' +
                '}';
    }
}
class SyncObj{
    private String name;
    public synchronized  void setName(String name){
        this.name = name;
    }

    @Override
    public synchronized String toString() {
        return "SyncObj{" +
                "name='" + name + '\'' +
                '}';
    }
}
