package com.company.state;

public interface OrderStatus {
    void newOrder(Order order);

    void sentOrder(Order order);
    void deliveredOrder(Order order);
    void canceledOrder(Order order);
    String getValue();
}
