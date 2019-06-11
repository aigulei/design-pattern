package com.ai.gof.behavioral.strategy;

public class FanxianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到用户的余额中");
    }
}
