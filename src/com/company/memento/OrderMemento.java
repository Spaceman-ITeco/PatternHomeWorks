package com.company.memento;

import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderMemento {
    private LocalDateTime changeTime;
    private HashMap<Product,Integer> products2counts;
    private OrderStatus status;

    public OrderMemento(LocalDateTime changeTime,HashMap<Product,Integer> products2counts,OrderStatus status)
    {   this.changeTime=changeTime;
        this.products2counts = products2counts;
        this.status=status; }

    public LocalDateTime getChangeTime() {
        return changeTime;
    }

    public HashMap<Product, Integer> getProducts2counts() {
        return products2counts;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
