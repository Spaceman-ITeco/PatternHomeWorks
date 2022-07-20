package com.company.state;

public class OrderDeliveredStatus implements OrderStatus {
    private String statusName;

    @Override
    public void newOrder(Order order) {
        //do nothing
        System.out.println("Firstly need to return back");
    }

    @Override
    public void sentOrder(Order order) {
        System.out.println("Order has been returned to delivery service");
        order.setOrderStatus(new OrderSentStatus());
    }

    @Override
    public void deliveredOrder(Order order) {
        //do nothing
        System.out.println("Order has already been delivered");
    }

    @Override
    public void canceledOrder(Order order) {
        System.out.println("Delivered order has been canceled");
        order.setOrderStatus(new OrderCanceledStatus());
    }

    @Override
    public String getValue() {
        return this.statusName;
    }
}
