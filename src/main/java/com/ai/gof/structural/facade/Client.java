package com.ai.gof.structural.facade;

public class Client {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("变形金刚");
        GiftExchangeService service = new GiftExchangeService();
        service.setPointsPaymentService(new PointsPaymentService());
        service.setQualifyService(new QualifyService());
        service.setShippingService(new ShippingService());

        service.giftExchange(pointGift);
    }
}
