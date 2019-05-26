package com.ai.gof.structural.facade;

public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointGift pointGift){
        if(qualifyService.isAvaiable(pointGift)){
            //资格校验通过
            if (pointsPaymentService.pay(pointGift)) {
                //如果支付积分成功
                String orderNo = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功，订单号是"+orderNo);
            }

        }
    }
}
