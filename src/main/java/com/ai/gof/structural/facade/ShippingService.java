package com.ai.gof.structural.facade;

public class ShippingService {
    public String shipGift(PointGift gift){
        System.out.println(gift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
