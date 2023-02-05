package pers.kylehsu.design.pattern.structural.proxy.dynamicproxy;

import pers.kylehsu.design.pattern.structural.proxy.IOrderService;
import pers.kylehsu.design.pattern.structural.proxy.Order;
import pers.kylehsu.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * Created by kylehsu
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
