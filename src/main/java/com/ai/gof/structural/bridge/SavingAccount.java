package com.ai.gof.structural.bridge;

public class SavingAccount implements  Account {
    @Override
    public Account openAccount() {
        System.out.println("创建活期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
