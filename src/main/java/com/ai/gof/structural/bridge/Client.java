package com.ai.gof.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icAccount = icbcBank.account;
        icAccount.showAccountType();
    }
}
