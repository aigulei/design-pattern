package com.ai.gof.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {
    private static Map<String,PromotionStrategy> PROMOTIONSTRATEGYMAP = new HashMap<>();

    static{
        PROMOTIONSTRATEGYMAP.put(PromotionKey.LIJIAN,new LijianPromotionStrategy());
        PROMOTIONSTRATEGYMAP.put(PromotionKey.MANJIAN,new ManjianPromotionStrategy());
        PROMOTIONSTRATEGYMAP.put(PromotionKey.FANXIAN,new FanxianPromotionStrategy());
    }
    private static final PromotionStrategy NO_PROMOTION = new EmptyPromotionStrategy();
    private PromotionFactory(){}
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTIONSTRATEGYMAP.get(promotionKey);
        return promotionStrategy==null?NO_PROMOTION:promotionStrategy;
    }
    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
