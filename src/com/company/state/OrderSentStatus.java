package com.company.state;

public class OrderSentStatus implements OrderStatus {
    private String statusName;

    @Override
    public void newOrder(Order order) {
        System.out.println("Sent order has been returned to new");
        order.setOrderStatus(new OrderNewStatus());
    }

    @Override
    public void sentOrder(Order order) {
        //do nothing
        System.out.println("Order has already been sent");
    }

    @Override
    public void deliveredOrder(Order order) {
        System.out.println("Sent order has been delivered");
        order.setOrderStatus(new OrderDeliveredStatus());
    }

    @Override
    public void canceledOrder(Order order) {
        System.out.println("Sent order has been canceled");
        order.setOrderStatus(new OrderCanceledStatus());
    }

    @Override
    public String getValue() {
        return this.statusName;
    }
}
