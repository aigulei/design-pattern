package com.ai.gof.structural.adapter;

public class PowerAdapter implements DC5V {
    private AC220V ac220V = new AC220V();
    @Override
    public int outputDC5V() {
        int adapterInput = ac220V.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("输入AC："+adapterInput+",输出DC："+adapterOutput);
        return adapterOutput;
    }
}
