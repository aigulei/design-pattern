package com.ai.gof.structural.proxy.staticproxy;

import com.ai.gof.structural.proxy.IOrderService;
import com.ai.gof.structural.proxy.Order;
import com.ai.gof.structural.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;

        System.err.println("静态代理分配到[db"+dbRouter+"]数据处理");

        afterMethod();
        return  0;
    }

    private void beforeMethod(){
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
