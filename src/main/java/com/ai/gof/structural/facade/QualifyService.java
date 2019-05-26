package com.ai.gof.structural.facade;

public class QualifyService {
    public boolean isAvaiable(PointGift pointGift){
        System.out.println("校验"+pointGift.getName()+" 积分资格通过");
        return true;
    }
}
