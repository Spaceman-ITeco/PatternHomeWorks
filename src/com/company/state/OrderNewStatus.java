package com.company.state;

public class OrderNewStatus implements OrderStatus{
    private String statusName;

    public OrderNewStatus() {
        this.statusName = "New order";
    }

    @Override
    public void newOrder(Order order) {
        //do nothing
    System.out.println("New order ready");

    }

    @Override
    public void sentOrder(Order order) {
        System.out.println("New order has been sent");
        order.setOrderStatus(new OrderSentStatus());
    }

    @Override
    public void deliveredOrder(Order order) {
        //do nothing
        System.out.println("Firstly need send");
    }

    @Override
    public void canceledOrder(Order order) {
        System.out.println("New order has been canceled");
        order.setOrderStatus(new OrderCanceledStatus());
    }

    @Override
    public String getValue() {
        return this.statusName;
    }
}
