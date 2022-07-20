package com.company.state;

public class OrderLaunch {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getOrderStatus().getValue());
        order.newOrder();
        order.canceledOrder();
        order.deliveredOrder();
        order.newOrder();
        order.sentOrder();
        order.sentOrder();
        order.deliveredOrder();
    }

}
