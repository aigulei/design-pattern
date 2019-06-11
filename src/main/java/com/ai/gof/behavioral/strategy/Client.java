package com.ai.gof.behavioral.strategy;

public class Client {
    /*public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new LijianPromotionStrategy());

        PromotionActivity activity1111 = new PromotionActivity(new FanxianPromotionStrategy());

        activity618.executePromotionStrategy();

        activity1111.executePromotionStrategy();
    }*/
    public static void main(String[] args) {
        String promotionKey = "LIJIAN111";
        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();

    }
}
