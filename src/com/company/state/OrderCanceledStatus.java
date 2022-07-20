package com.company.state;

public class OrderCanceledStatus implements OrderStatus {
    private String statusName;

    @Override
    public void newOrder(Order order) {
        System.out.println("Canceled order has been returned to new");
        order.setOrderStatus(new OrderNewStatus());
    }

    @Override
    public void sentOrder(Order order) {
        //do nothing
        System.out.println("Possible only change to new");
    }

    @Override
    public void deliveredOrder(Order order) {
        //do nothing
        System.out.println("Possible only change to new");
    }

    @Override
    public void canceledOrder(Order order) {
//do nothing
        System.out.println("Order has already been canceled");
    }

    @Override
    public String getValue() {
        return this.statusName;
    }
}
