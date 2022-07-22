package com.company.memento;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Order {
    private LocalDateTime changeTime;
    private HashMap<Product,Integer> products2counts;
    private OrderStatus status;

    public Order()
    {changeTime = LocalDateTime.now();
    products2counts = new HashMap<>();
    status=OrderStatus.NEW;}

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public LocalDateTime getChangeTime() {
        return changeTime;
    }

    public HashMap<Product, Integer> getProducts2counts() {
        return products2counts;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addProduct(Product product, int count)
    {products2counts.put(product,count);
    changeTime = LocalDateTime.now();}

    public OrderMemento save()
    {System.out.println("Сохранение документа");
    return  new OrderMemento(changeTime,products2counts,status);}

    public void load(OrderMemento memento)
    {products2counts = memento.getProducts2counts();
    status=memento.getStatus();}

}
