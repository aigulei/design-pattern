package com.ai.gof.structural.decorator.v1;

public class Client {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+"销售价格:"+battercake.cost());

        battercake = new BattercakeWithEgg();
        System.out.println(battercake.getDesc()+"销售价格:"+battercake.cost());

        battercake = new BattercakeWithEggSausage();
        System.out.println(battercake.getDesc()+"销售价格:"+battercake.cost());
    }
}
