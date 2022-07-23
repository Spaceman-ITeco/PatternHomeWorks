package com.company.prototype;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Objects;

public class Order extends AbstractOrder{
    private LocalDateTime changeTime;
    private HashMap<Product,Integer> products2counts;
    private OrderStatus status;

    public Order() {
        changeTime = LocalDateTime.now();
        products2counts = new HashMap<>();
        status= OrderStatus.NEW;
    }
    public LocalDateTime getChangeTime() {
        return changeTime;
    }

    public HashMap<Product, Integer> getProducts() {
        return products2counts;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        changeTime = LocalDateTime.now();
    }

    public void addProduct(Product product, int count)
    {   products2counts.put(product,count);
        changeTime = LocalDateTime.now();}

    public Order(Order order){
        if (order!=null) {
            changeTime = order.getChangeTime();
            products2counts = order.getProducts();
            status = order.getStatus();
        }
    }

    @Override
    public AbstractOrder getCopy() {
        return new Order(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return changeTime.equals(order.changeTime) && Objects.equals(products2counts, order.products2counts) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeTime, products2counts, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "changeTime=" + changeTime +
                ", products2counts=" + products2counts +
                ", status=" + status +
                '}';
    }
}
