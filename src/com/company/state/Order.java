package com.company.state;

public class Order {
    private OrderStatus orderStatus;

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Order()
    {this.orderStatus=new OrderNewStatus();}

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void newOrder()
    {this.orderStatus.newOrder(this);}
    public void sentOrder()
    {this.orderStatus.sentOrder(this);}
    public void deliveredOrder()
    {this.orderStatus.deliveredOrder(this);}
    public void canceledOrder()
    {this.orderStatus.canceledOrder(this);}
}
